package com.reizu.diana.utility

import com.reizu.diana.client.ErrorResponse
import retrofit2.Call

/**
 * Converts Call to internal response body object
 *
 * @return Response Body object
 */
fun <T> Call<T>.result(): T {
    return execute().let {
        if (it.isSuccessful) it.body()!! else throw ErrorResponse(it.code(), it.message())
    }
}
