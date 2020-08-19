package com.reizu.diana.client

class ErrorResponse(val code: Int, message: String) : Throwable("($code) $message")
