package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import com.google.gson.JsonObject
import java.time.LocalDateTime

data class User(

    override val id: String,

    val names: JsonObject,

    @JsonProperty("weblink")
    val webLink: String,

    @JsonProperty("name-style")
    val nameStyle: JsonObject,

    val role: String,

    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    val signup: LocalDateTime,

    val location: JsonObject,

    val twitch: SocialLink,

    val hitbox: SocialLink,

    val youtube: SocialLink,

    val twitter: SocialLink,

    val speedrunslive: SocialLink,

    override val links: List<Link>

): Resourceable
