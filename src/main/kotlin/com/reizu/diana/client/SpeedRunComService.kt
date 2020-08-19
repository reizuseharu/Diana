package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Game
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Singleton

@Singleton
interface SpeedRunComService {

    @GET("categories/{id}")
    fun getCategory(@Path("id") id: String): Call<ApiResource<Category>>

    @GET("games/")
    fun getGameList(): Call<ApiResourceList<Game>>

    @GET("games/{id}")
    fun getGame(@Path("id") id: String): Call<ApiResource<Game>>

}
