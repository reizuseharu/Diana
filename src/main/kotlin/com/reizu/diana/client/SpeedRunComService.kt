package com.reizu.diana.client

import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.ApiResourceList
import com.reizu.diana.model.Category
import com.reizu.diana.model.Developer
import com.reizu.diana.model.Engine
import com.reizu.diana.model.Game
import com.reizu.diana.model.GameType
import com.reizu.diana.model.Genre
import com.reizu.diana.model.Guest
import com.reizu.diana.model.Leaderboard
import com.reizu.diana.model.Level
import com.reizu.diana.model.Notification
import com.reizu.diana.model.PersonalBest
import com.reizu.diana.model.Platform
import com.reizu.diana.model.Publisher
import com.reizu.diana.model.Region
import com.reizu.diana.model.Run
import com.reizu.diana.model.RunStatus
import com.reizu.diana.model.Series
import com.reizu.diana.model.User
import com.reizu.diana.model.Variable
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface SpeedRunComService {

    // - Add query parameters
    // - Implement pagination
    // - Verify all embedded variables have methods

    @GET("categories/{id}")
    fun getCategory(@Path("id") id: String): Call<ApiResource<Category>>

    @GET("categories/{id}/variables")
    fun getCategoryVariables(@Path("id") id: String): Call<ApiResourceList<Variable>>

    @GET("categories/{id}/records")
    fun getCategoryRecords(@Path("id") id: String): Call<ApiResourceList<Leaderboard>>

    @GET("developers")
    fun getDevelopers(): Call<ApiResourceList<Developer>>

    @GET("developers/{id}")
    fun getDeveloper(@Path("id") id: String): Call<ApiResource<Developer>>

    @GET("engines")
    fun getEngines(): Call<ApiResourceList<Engine>>

    @GET("engines/{id}")
    fun getEngine(@Path("id") id: String): Call<ApiResource<Engine>>

    @GET("games")
    fun getGames(): Call<ApiResourceList<Game>>

    @GET("games/{id}")
    fun getGame(@Path("id") id: String): Call<ApiResource<Game>>

    @GET("games/{id}/categories")
    fun getGameCategories(@Path("id") id: String): Call<ApiResourceList<Category>>

    @GET("games/{id}/levels")
    fun getGameLevels(@Path("id") id: String): Call<ApiResourceList<Level>>

    @GET("games/{id}/variables")
    fun getGameVariables(@Path("id") id: String): Call<ApiResourceList<Variable>>

    @GET("games/{id}/derived-games")
    fun getDerivedGames(@Path("id") id: String): Call<ApiResourceList<Game>>

    @GET("games/{id}/records")
    fun getGameRecords(@Path("id") id: String): Call<ApiResourceList<Leaderboard>>

    @GET("gametypes")
    fun getGameTypes(): Call<ApiResourceList<GameType>>

    @GET("gametypes/{id}")
    fun getGameType(@Path("id") id: String): Call<ApiResource<GameType>>

    @GET("genres")
    fun getGenres(): Call<ApiResourceList<Genre>>

    @GET("genres/{id}")
    fun getGenre(@Path("id") id: String): Call<ApiResource<Genre>>

    @GET("guests/{name}")
    fun getGuest(@Path("name") name: String): Call<ApiResource<Guest>>

    @GET("leaderboards/{game}/category/{category}")
    fun getLeaderboardByGameAndCategory(@Path("game") game: String, @Path("category") category: String): Call<ApiResource<Leaderboard>>

    @GET("leaderboards/{game}/level/{level}/{category}")
    fun getLeaderboardByGameAndLevelAndCategory(@Path("game") game: String, @Path("level") level: String, @Path("category") category: String): Call<ApiResource<Leaderboard>>

    @GET("levels/{id}")
    fun getLevel(@Path("id") id: String): Call<ApiResource<Level>>

    @GET("levels/{id}/categories")
    fun getLevelCategories(@Path("id") id: String): Call<ApiResourceList<Category>>

    @GET("levels/{id}/variables")
    fun getLevelVariables(@Path("id") id: String): Call<ApiResourceList<Variable>>

    @GET("levels/{id}/leaderboards")
    fun getLevelRecords(@Path("id") id: String): Call<ApiResourceList<Leaderboard>>

    @GET("notifications")
    fun getNotifications(): Call<ApiResourceList<Notification>>

    @GET("platforms")
    fun getPlatforms(): Call<ApiResourceList<Platform>>

    @GET("platforms")
    fun getPlatforms(@Query("offset") offset: Int, @Query("max") max: Int): Call<ApiResourceList<Platform>>

    @GET("platforms/{id}")
    fun getPlatform(@Path("id") id: String): Call<ApiResource<Platform>>

    @GET("profile")
    fun getProfile(): Call<ApiResource<User>>

    @GET("publishers")
    fun getPublishers(): Call<ApiResourceList<Publisher>>

    @GET("publishers/{id}")
    fun getPublisher(@Path("id") id: String): Call<ApiResource<Publisher>>

    @GET("regions")
    fun getRegions(): Call<ApiResourceList<Region>>

    @GET("regions/{id}")
    fun getRegion(@Path("id") id: String): Call<ApiResource<Region>>

    @GET("runs")
    fun getRuns(): Call<ApiResourceList<Run>>

    @GET("runs")
    fun getRuns(@Query("offset") offset: Int, @Query("max") max: Int, @Query("game") gameId: String, @Query("category") categoryId: String): Call<ApiResourceList<Run>>

    @GET("runs/{id}")
    fun getRun(@Path("id") id: String): Call<ApiResource<Run>>

    @POST("runs")
    fun createRun(run: Run): Call<ApiResource<Run>>

    @PUT("runs/{id}/status")
    fun modifyRunStatus(@Path("id") id: String, status: RunStatus): Call<ApiResource<Run>>

    @PUT("runs/{id}/players")
    fun modifyRunPlayer(@Path("id") id: String, players: List<User>): Call<ApiResource<Run>>

    @DELETE("runs/{id}")
    fun removeRun(@Path("id") id: String): Call<ApiResource<Run>>

    @GET("series")
    fun getSeries(): Call<ApiResourceList<Series>>

    @GET("series/{id}")
    fun getSeries(@Path("id") id: String): Call<ApiResource<Series>>

    @GET("series/{id}/games")
    fun getSeriesGames(@Path("id") id: String): Call<ApiResourceList<Game>>

    @GET("users")
    fun getUsers(): Call<ApiResourceList<User>>

    @GET("users")
    fun getUsers(@Query("offset") offset: Int, @Query("max") max: Int): Call<ApiResourceList<User>>

    @GET("users")
    fun getUsers(@Query("offset") offset: Int, @Query("max") max: Int, @Query("name") partialName: String): Call<ApiResourceList<User>>

    @GET("users/{id}")
    fun getUser(@Path("id") id: String): Call<ApiResource<User>>

    @GET("users/{id}/personal-bests")
    fun getUserPersonalBests(@Path("id") id: String): Call<ApiResource<PersonalBest>>

    @GET("variables/{id}")
    fun getVariable(@Path("id") id: String): Call<ApiResource<Variable>>

}
