package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class RunTime(

    val primary: String,

    @JsonProperty("primary_t")
    val primaryTime: Int,

    @JsonProperty("realtime")
    val realTime: String,

    @JsonProperty("realtime_t")
    val realTimeTime: Int,

    @JsonProperty("realtime_noloads")
    val realTimeNoLoads: String?,

    @JsonProperty("realtime_noloads_t")
    val realTimeNoLoadsTime: Int,

    @JsonProperty("ingame")
    val inGame: String?,

    @JsonProperty("ingame_t")
    val inGameTime: Int

)
