package com.reizu.diana.dagger

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.reizu.diana.client.DaggerSpeedRunComApiClient
import com.reizu.diana.client.SpeedRunComApiClient
import com.reizu.diana.client.SpeedRunComClient
import com.reizu.diana.model.Platform
import com.reizu.diana.model.Run
import java.io.File

fun main() {
    val objectMapper = jacksonObjectMapper()
    objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true)

    val speedRunComApiClient: SpeedRunComApiClient = DaggerSpeedRunComApiClient.create()
    val speedRunComClient: SpeedRunComClient = speedRunComApiClient.generate()

    // querySnap(speedRunComClient, objectMapper)
    queryPlatforms(speedRunComClient, objectMapper)
}

fun querySnap(speedRunComClient: SpeedRunComClient, objectMapper: ObjectMapper) {

//    val gameId = "pkmnsnap"
//    val category = "100"
//    println(speedRunComClient.getGameRecords(gameId))
//    println(speedRunComClient.getGameCategories(gameId))
    val game = "pkmnsnap"
    val categories = listOf(
        "Any",
        "100",
        "Challenge_Score",
        "250k_Points"
    )
//    val game = "pkmnsnap_extras"
//    val categories = listOf(
//        "100_Wonderful",
//        "Magikarp",
//        "Jynx",
//        "2p1c"
//    )
//    val game = "new_pokemon_snap"
//    val categories = listOf(
//        "Any",
//        "All_Pokemon"
//    )

    val gameToId = mapOf(
        "pkmnsnap" to "j1lqqj6g",
        "pkmnsnap_extras" to "pd0wmkv1",
        "new_pokemon_snap" to "o1yj2lv1"
    )
    val categoryToId = mapOf(
        "Any" to "xk9nn620",
        "100" to "z27oozd0",
        "Challenge_Score" to "7kj3ln23",
        "250k_Points" to "7kjqvozd"
    )
//    val categoryToId = mapOf(
//        "100_Wonderful" to "vdo8g11k",
//        "Magikarp" to "vdo8nw9k",
//        "Jynx" to "wkp1r68k",
//        "2p1c" to "9kvol032"
//    )
//    val categoryToId = mapOf(
//        "Any" to "ndxe49rk",
//        "All_Pokemon" to "mkev79x2"
//    )

    val gameId = gameToId[game] ?: "snap"
    val max = 200
    val allRuns = mutableListOf<Run>()
    categories.forEach { category ->
        val categoryId = categoryToId[category] ?: "unknown"
        var offset = 0
        do {
            val partialOutput = speedRunComClient.getRuns(offset, max, gameId, categoryId)
            allRuns.addAll(partialOutput.data)
            offset += max
        } while (partialOutput.pagination.size == partialOutput.pagination.max)

        val output = allRuns
        val jsonOutput = objectMapper.writeValueAsString(output)
        File("$game-$category-historical-output.json").writeText(jsonOutput)
    }
}

fun queryPlatforms(speedRunComClient: SpeedRunComClient, objectMapper: ObjectMapper) {
    val allPlatforms = mutableListOf<Platform>()
    val max = 200
    var offset = 0
    do {
        val partialOutput = speedRunComClient.getPlatforms(offset, max)
        allPlatforms.addAll(partialOutput.data)
        offset += max
    } while (partialOutput.pagination.size == partialOutput.pagination.max)
    val output = allPlatforms
    val jsonOutput = objectMapper.writeValueAsString(output)
    File("platforms.json").writeText(jsonOutput)

}
