package com.reizu.diana.client

class ErrorResponse(code: Int, message: String) : Throwable("($code) $message")
