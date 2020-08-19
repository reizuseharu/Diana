package com.reizu.diana.dagger

import com.reizu.diana.client.DaggerSpeedRunComApiClient
import com.reizu.diana.client.SpeedRunComApiClient
import com.reizu.diana.client.SpeedRunComClient

fun main() {
    val speedRunComApiClient: SpeedRunComApiClient = DaggerSpeedRunComApiClient.create()
    val speedRunComClient: SpeedRunComClient = speedRunComApiClient.generate()
    val gameId = "sms"
    println(speedRunComClient.getGame(gameId))
}
