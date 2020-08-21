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
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import rx.Observable
import javax.inject.Singleton

@Singleton
interface RxSpeedRunComService {

    // - Add query parameters
    // - Implement pagination
    // - Verify all embedded variables have methods

    @GET("categories/{id}")
    fun getCategory(@Path("id") id: String): Observable<ApiResource<Category>>

    @GET("categories/{id}/variables")
    fun getCategoryVariables(@Path("id") id: String): Observable<ApiResourceList<Variable>>

    @GET("categories/{id}/records")
    fun getCategoryRecords(@Path("id") id: String): Observable<ApiResourceList<Leaderboard>>

    @GET("developers/")
    fun getDevelopers(): Observable<ApiResourceList<Developer>>

    @GET("developers/{id}")
    fun getDeveloper(@Path("id") id: String): Observable<ApiResource<Developer>>

    @GET("engines/")
    fun getEngines(): Observable<ApiResourceList<Engine>>

    @GET("engines/{id}")
    fun getEngine(@Path("id") id: String): Observable<ApiResource<Engine>>

    @GET("games/")
    fun getGames(): Observable<ApiResourceList<Game>>

    @GET("games/{id}")
    fun getGame(@Path("id") id: String): Observable<ApiResource<Game>>

    @GET("games/{id}/categories")
    fun getGameCategories(@Path("id") id: String): Observable<ApiResourceList<Category>>

    @GET("games/{id}/levels")
    fun getGameLevels(@Path("id") id: String): Observable<ApiResourceList<Level>>

    @GET("games/{id}/variables")
    fun getGameVariables(@Path("id") id: String): Observable<ApiResourceList<Variable>>

    @GET("games/{id}/derived-games")
    fun getDerivedGames(@Path("id") id: String): Observable<ApiResourceList<Game>>

    @GET("games/{id}/records")
    fun getGameRecords(@Path("id") id: String): Observable<ApiResourceList<Leaderboard>>

    @GET("gametypes/")
    fun getGameTypes(): Observable<ApiResourceList<GameType>>

    @GET("gametypes/{id}")
    fun getGameType(@Path("id") id: String): Observable<ApiResource<GameType>>

    @GET("genres/")
    fun getGenres(): Observable<ApiResourceList<Genre>>

    @GET("genres/{id}")
    fun getGenre(id: String): Observable<ApiResource<Genre>>

    @GET("guests/{name}")
    fun getGuest(name: String): Observable<ApiResource<Guest>>

    @GET("leaderboards/{game}/category/{category}")
    fun getLeaderboardByGameAndCategory(game: String, category: String): Observable<ApiResource<Leaderboard>>

    @GET("leaderboards/{game}/level/{level}/{category}")
    fun getLeaderboardByGameAndLevelAndCategory(game: String, level: String, category: String): Observable<ApiResource<Leaderboard>>

    @GET("levels/{id}")
    fun getLevel(@Path("id") id: String): Observable<ApiResource<Level>>

    @GET("levels/{id}/categories")
    fun getLevelCategories(@Path("id") id: String): Observable<ApiResourceList<Category>>

    @GET("levels/{id}/variables")
    fun getLevelVariables(@Path("id") id: String): Observable<ApiResourceList<Variable>>

    @GET("levels/{id}/leaderboards")
    fun getLevelRecords(@Path("id") id: String): Observable<ApiResourceList<Leaderboard>>

    @GET("notifications/")
    fun getNotifications(): Observable<ApiResourceList<Notification>>

    @GET("platforms/")
    fun getPlatforms(): Observable<ApiResourceList<Platform>>

    @GET("platforms/{id}")
    fun getPlatform(@Path("id") id: String): Observable<ApiResource<Platform>>

    @GET("profile/")
    fun getProfile(): Observable<ApiResource<User>>

    @GET("publishers/")
    fun getPublishers(): Observable<ApiResourceList<Publisher>>

    @GET("publishers/{id}")
    fun getPublisher(@Path("id") id: String): Observable<ApiResource<Publisher>>

    @GET("regions/")
    fun getRegions(): Observable<ApiResourceList<Region>>

    @GET("regions/{id}")
    fun getRegion(@Path("id") id: String): Observable<ApiResource<Region>>

    @GET("runs/")
    fun getRuns(): Observable<ApiResourceList<Run>>

    @GET("runs/{id}")
    fun getRun(@Path("id") id: String): Observable<ApiResource<Run>>

    @POST("runs/")
    fun createRun(run: Run): Observable<ApiResource<Run>>

    @PUT("runs/{id}/status")
    fun modifyRunStatus(@Path("id") id: String, status: RunStatus): Observable<ApiResource<Run>>

    @PUT("runs/{id}/players")
    fun modifyRunPlayer(@Path("id") id: String, players: List<User>): Observable<ApiResource<Run>>

    @DELETE("runs/{id}")
    fun removeRun(@Path("id") id: String): Observable<ApiResource<Run>>

    @GET("series/")
    fun getSeries(): Observable<ApiResourceList<Series>>

    @GET("series/{id}")
    fun getSeries(@Path("id") id: String): Observable<ApiResource<Series>>

    @GET("series/{id}/games")
    fun getSeriesGames(@Path("id") id: String): Observable<ApiResourceList<Game>>

    @GET("users/")
    fun getUsers(): Observable<ApiResourceList<User>>

    @GET("users/{id}")
    fun getUser(@Path("id") id: String): Observable<ApiResource<User>>

    @GET("users/{id}/personal-bests")
    fun getUserPersonalBests(@Path("id") id: String): Observable<ApiResource<PersonalBest>>

    @GET("variables/{id}")
    fun getVariable(@Path("id") id: String): Observable<ApiResource<Variable>>

}
