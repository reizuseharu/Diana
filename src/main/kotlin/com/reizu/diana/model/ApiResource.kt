package com.reizu.diana.model

data class ApiResource<out T : Modelable>(
    val data: T
)
