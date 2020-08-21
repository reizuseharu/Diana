package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Level(

    override val id: String,

    val name: String,

    @JsonProperty("weblink")
    val webLink: String,

    val rules: String,

    override val links: List<Link>

): Resourceable
