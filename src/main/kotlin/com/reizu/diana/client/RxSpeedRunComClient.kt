package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Game
import rx.Observable
import javax.inject.Inject

class RxSpeedRunComClient @Inject constructor(private val service: RxSpeedRunComService): RxSpeedRunComApi {

    override fun getCategory(id: String): Observable<ApiResource<Category>> {
        return service.getCategory(id)
    }

    override fun getGameList(): Observable<ApiResourceList<Game>> {
        return service.getGameList()
    }

    override fun getGame(id: String): Observable<ApiResource<Game>> {
        return service.getGame(id)
    }

}
