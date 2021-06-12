package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Variable(

    override val id: String,

    val name: String,

    val category: String?,

    val scope: Scope,

    val mandatory: Boolean,

    @JsonProperty("user-defined")
    val userDefined: Boolean,

    val obsoletes: Boolean,

    val values: Value,

    @JsonProperty("is-subcategory")
    val isSubcategory: Boolean,

    override val links: List<Link>

): Resourceable
