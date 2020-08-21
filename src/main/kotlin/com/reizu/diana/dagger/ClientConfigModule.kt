package com.reizu.diana.dagger

import com.reizu.diana.client.ClientConfig
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import com.reizu.diana.utility.Constants as c

@Module
class ClientConfigModule : ClientConfig {

    @Provides
    @Singleton
    override fun provideRoot(): HttpUrl {
        return HttpUrl.parse(c.ROOT_URL)!!
    }

    @Provides
    @Singleton
    override fun provideClient(): OkHttpClient {
        return OkHttpClient.Builder().apply {
            retryOnConnectionFailure(false)
            connectTimeout(c.CONNECT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            readTimeout(c.READ_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            writeTimeout(c.WRITE_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
        }.build()
    }

}
