package com.reizu.diana.model

data class Platform(

    override val id: String,

    val name: String,

    val released: Int,

    override val links: List<Link>

): Resourceable
