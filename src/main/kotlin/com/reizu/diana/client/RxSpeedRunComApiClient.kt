package com.reizu.diana.client

import com.reizu.diana.dagger.RxSpeedRunComApiModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RxSpeedRunComApiModule::class])
interface RxSpeedRunComApiClient {

    fun generate(): RxSpeedRunComClient

}
