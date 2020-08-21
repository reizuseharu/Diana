package com.reizu.diana.client

import com.reizu.diana.dagger.SpeedRunComApiModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SpeedRunComApiModule::class])
interface SpeedRunComApiClient {

    fun generate(): SpeedRunComClient

}
