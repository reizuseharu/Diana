package com.reizu.diana.model

data class Video(

    val text: String,

    override val links: List<Link>

): Linkable
