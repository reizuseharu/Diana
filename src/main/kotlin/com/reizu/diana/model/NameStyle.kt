package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class NameStyle(

    val style: String?,

    val color: Color?,

    @JsonProperty("color-from")
    val colorFrom: Color?,

    @JsonProperty("color-to")
    val colorTo: Color?

)
