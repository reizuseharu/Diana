package com.reizu.diana.model

data class Category(

    override val id: String,

    val name: String,

    val weblink: String,

    val type: String,

    val rules: String,

    val players: PlayerCategory,

    val miscellaneous: Boolean,

    override val links: List<Link>

): Resourceable
