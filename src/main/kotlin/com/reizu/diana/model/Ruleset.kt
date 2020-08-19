package com.reizu.diana.model

data class Ruleset(

    val showMilliseconds: Boolean,

    val requireVerification: Boolean,

    val requireVideo: Boolean,

    val runTimes: List<String>,

    val defaultTime: String,

    val emulatorsAllowed: Boolean

)
