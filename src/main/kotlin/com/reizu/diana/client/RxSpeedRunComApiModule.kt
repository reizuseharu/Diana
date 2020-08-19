package com.reizu.diana.client

import com.reizu.diana.utility.Resource
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module(includes = [ClientConfigModule::class])
class RxSpeedRunComApiModule {

    @Provides
    @Singleton
    fun provideRetrofit(rootUrl: HttpUrl, client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(rootUrl)
            .addConverterFactory(JacksonConverterFactory.create(Resource.OBJECT_MAPPER))
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .client(client)
            .build()
    }

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): RxSpeedRunComService {
        return retrofit.create(RxSpeedRunComService::class.java)
    }

    @Provides
    @Singleton
    fun provideSpeedRunComClient(service: RxSpeedRunComService): RxSpeedRunComClient {
        return RxSpeedRunComClient(service)
    }


}
