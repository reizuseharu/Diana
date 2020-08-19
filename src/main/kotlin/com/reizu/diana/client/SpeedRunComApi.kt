package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Game

interface SpeedRunComApi {

    fun getCategory(id: String): ApiResource<Category>

    fun getGameList(): ApiResourceList<Game>

    fun getGame(id: String): ApiResource<Game>

}
