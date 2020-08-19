package com.reizu.diana.model

data class ApiResourceList<out T : Modelable>(
    val data: List<T>
)
