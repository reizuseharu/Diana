package com.reizu.diana.model

data class Leaderboard(

    val weblink: String,

    val game: String,

    val category: String,

    val level: Level?,

    val platform: Platform?,

    val region: Region?,

    val emulators: Boolean?,

    val videoOnly: Boolean,

    val timing: String,

    val values: Map<String, Any>,

    val runs: List<LeaderboardRun>,

    val name: String,

    override val links: List<Link>

): Linkable
