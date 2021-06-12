package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Leaderboard(

    @JsonProperty("weblink")
    val webLink: String,

    val game: String,

    val category: String,

    val level: Level?,

    val platform: Platform?,

    val region: Region?,

    val emulators: Boolean?,

    val videoOnly: Boolean,

    val timing: String,

    val values: Map<String, String>,

    val runs: List<LeaderboardRun>,

    override val links: List<Link>

): Linkable
