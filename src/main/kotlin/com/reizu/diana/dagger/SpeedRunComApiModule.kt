package com.reizu.diana.dagger

import com.reizu.diana.client.SpeedRunComClient
import com.reizu.diana.client.SpeedRunComService
import com.reizu.diana.utility.Resource
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module(includes = [ClientConfigModule::class])
class SpeedRunComApiModule {

    @Provides
    @Singleton
    fun provideRetrofit(rootUrl: HttpUrl, client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(rootUrl)
            .addConverterFactory(JacksonConverterFactory.create(Resource.OBJECT_MAPPER))
            .client(client)
            .build()
    }

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): SpeedRunComService {
        return retrofit.create(SpeedRunComService::class.java)
    }

    @Provides
    @Singleton
    fun provideSpeedRunComClient(service: SpeedRunComService): SpeedRunComClient {
        return SpeedRunComClient(service)
    }


}
