package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Game
import retrofit2.Call
import javax.inject.Inject

class SpeedRunComClient @Inject constructor(private val service: SpeedRunComService) : SpeedRunComApi {

    private fun <T> Call<T>.result(): T {
        return execute().let {
            if (it.isSuccessful) it.body()!! else throw ErrorResponse(it.code(), it.message())
        }
    }

    override fun getCategory(id: String): ApiResource<Category> {
        return service.getCategory(id).result()
    }

    override fun getGameList(): ApiResourceList<Game> {
        return service.getGameList().result()
    }

    override fun getGame(id: String): ApiResource<Game> {
        return service.getGame(id).result()
    }

}
