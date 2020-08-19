package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class GameAsset(

    val logo: Asset,

    val coverTiny: Asset,

    val coverSmall: Asset,

    val coverMedium: Asset,

    val coverLarge: Asset,

    val icon: Asset,

    @JsonProperty("trophy-1st")
    val trophy1st: Asset,

    @JsonProperty("trophy-2nd")
    val trophy2nd: Asset,

    @JsonProperty("trophy-3rd")
    val trophy3rd: Asset,

    @JsonProperty("trophy-4th")
    val trophy4th: Asset?,

    val background: Asset,

    val foreground: Asset?

)
