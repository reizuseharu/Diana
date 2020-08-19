package com.reizu.diana.client

import okhttp3.HttpUrl
import okhttp3.OkHttpClient

interface ClientConfig {

    fun provideRoot(): HttpUrl

    fun provideClient(): OkHttpClient

}
