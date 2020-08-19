package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import java.time.LocalDate

data class Run(

    override val id: String,

    val weblink: String,

    val game: String,

    val level: Level?,

    val category: String,

    val videos: Video,

    val comment: String,

//    val status: RunStatus,

//    val players: List<Player>,

    @JsonDeserialize(using = LocalDateDeserializer::class)
    @JsonSerialize(using = LocalDateSerializer::class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    val date: LocalDate?,

    val submitted: Boolean?,

//    val times: RunTime,

    val system: System,

//    val splits: Split,

    val values: Map<String, String>,

    val released: Int,

    override val links: List<Link>

): Resourceable
