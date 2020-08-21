package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.JsonObject


data class Variable(

    override val id: String,

    val name: String,

    val category: String?,

    val scope: JsonObject, // val type: String

    val mandatory: Boolean,

    @JsonProperty("user-defined")
    val userDefined: Boolean,

    val obsoletes: Boolean,

    val values: JsonObject, // Big Object

    @JsonProperty("is-subcategory")
    val isSubcategory: Boolean,

    override val links: List<Link>

): Resourceable
