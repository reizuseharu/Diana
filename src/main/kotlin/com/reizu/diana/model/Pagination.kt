package com.reizu.diana.model

data class Pagination(

    val offset: Int,

    val max: Int,

    val size: Int,

    val name: String?,

    override val links: List<Link> = listOf()

): Linkable
