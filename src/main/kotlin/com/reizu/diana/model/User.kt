package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import java.time.LocalDateTime

data class User(

    override val id: String,

    val names: Name,

    val pronouns: String?,

    @JsonProperty("weblink")
    val webLink: String,

    @JsonProperty("name-style")
    val nameStyle: NameStyle,

    val role: String,

    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    val signup: LocalDateTime,

    val location: Location?,

    val twitch: SocialLink?,

    val hitbox: SocialLink?,

    val youtube: SocialLink?,

    val twitter: SocialLink?,

    val speedrunslive: SocialLink?,

    override val links: List<Link> = listOf()

): Resourceable
