package com.reizu.diana.model

data class Guest(

    val name: String,

    override val links: List<Link>

): Linkable
