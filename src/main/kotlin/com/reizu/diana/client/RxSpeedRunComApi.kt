package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Game
import rx.Observable

interface RxSpeedRunComApi {

    fun getCategory(id: String): Observable<ApiResource<Category>>

    fun getGameList(): Observable<ApiResourceList<Game>>

    fun getGame(id: String): Observable<ApiResource<Game>>

}
