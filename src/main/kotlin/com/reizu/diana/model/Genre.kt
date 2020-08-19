package com.reizu.diana.model

data class Genre(

    override val id: String,

    val name: String,

    override val links: List<Link>

): Resourceable
