package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Category(

    override val id: String,

    val name: String,

    @JsonProperty("weblink")
    val webLink: String,

    val type: String,

    val rules: String,

    val players: PlayerCategory,

    val miscellaneous: Boolean,

    override val links: List<Link>

): Resourceable
