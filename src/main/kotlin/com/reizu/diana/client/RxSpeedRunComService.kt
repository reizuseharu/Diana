package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Game
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable
import javax.inject.Singleton

@Singleton
interface RxSpeedRunComService {

    @GET("category/{id}/")
    fun getCategory(@Path("id") id: String): Observable<ApiResource<Category>>

    @GET("game/")
    fun getGameList(): Observable<ApiResourceList<Game>>

    @GET("game/{id}/")
    fun getGame(@Path("id") id: String): Observable<ApiResource<Game>>

}
