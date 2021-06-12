package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import java.time.LocalDateTime

data class Series(

    override val id: String,

    val names: Name,

    val abbreviation: String,

    @JsonProperty("weblink")
    val webLink: String,

    val moderators: Map<String, Moderator>,

    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    val created: LocalDateTime,

    val assets: GameAsset,

    override val links: List<Link>

): Resourceable
