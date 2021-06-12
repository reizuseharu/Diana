package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStatus(

    val status: String,

    val reason: String?,

    val examiner: String?,

    @JsonProperty("verify-date")
    val verifyDate: String?

)
