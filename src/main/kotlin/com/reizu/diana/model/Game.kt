package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import java.time.LocalDate
import java.time.LocalDateTime

data class Game(

    override val id: String,

    val names: Name,

    val abbreviation: String,

    @JsonProperty("weblink")
    val webLink: String,

    val released: Int,

    @JsonDeserialize(using = LocalDateDeserializer::class)
    @JsonSerialize(using = LocalDateSerializer::class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    val releaseDate: LocalDate,

    val ruleset: Ruleset,

    val romhack: Boolean,

    val gametypes: List<GameType>,

    val platforms: List<String>,

    val regions: List<String>,

    val genres: List<String>,

    val engines: List<String>,

    val developers: List<String>,

    val publishers: List<String>,

    val moderators: Map<String, Moderator>,

    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    val created: LocalDateTime?,

    val assets: GameAsset,

    override val links: List<Link>

): Resourceable
