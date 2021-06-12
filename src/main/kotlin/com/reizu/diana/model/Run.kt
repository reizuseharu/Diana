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

data class Run(

    override val id: String,

    @JsonProperty("weblink")
    val webLink: String,

    val game: String,

    val level: Level?,

    val category: String,

    val videos: Video?,

    val comment: String?,

    val status: RunStatus,

    val players: List<Player>,

    @JsonDeserialize(using = LocalDateDeserializer::class)
    @JsonSerialize(using = LocalDateSerializer::class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    val date: LocalDate?,

    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    val submitted: LocalDateTime?,

    val times: RunTime,

    val system: GameSystem,

    val splits: Link?,

    val values: Map<String, String>,

    val released: Int,

    override val links: List<Link> = listOf()

): Resourceable
