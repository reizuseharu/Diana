package com.reizu.diana.model

data class PersonalBest(

    val place: Int,

    val run: Run,

    val game: Game?,

    val category: Category?

): Modelable
