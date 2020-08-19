package com.reizu.diana.model

data class Level(

    override val id: String,

    val name: String,

    val weblink: String,

    val rules: String,

    override val links: List<Link>

): Resourceable
