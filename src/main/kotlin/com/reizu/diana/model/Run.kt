package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import com.google.gson.JsonObject
import java.time.LocalDate

data class Run(

    override val id: String,

    @JsonProperty("weblink")
    val webLink: String,

    val game: String,

    val level: Level?,

    val category: String,

    val videos: Video,

    val comment: String,

    val status: RunStatus,

    val players: List<User>,

    @JsonDeserialize(using = LocalDateDeserializer::class)
    @JsonSerialize(using = LocalDateSerializer::class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    val date: LocalDate?,

    val submitted: Boolean?,

    val times: JsonObject,

    val system: System,

    val splits: Link,

    val values: Map<String, String>,

    val released: Int,

    override val links: List<Link>

): Resourceable
