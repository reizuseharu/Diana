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
import rx.Observable

interface RxSpeedRunComApi {

    // - Add query parameters
    // - Implement pagination
    // - Verify all embedded variables have methods

    fun getCategory(id: String): Observable<ApiResource<Category>>

    fun getCategoryVariables(id: String): Observable<ApiResourceList<Variable>>

    fun getCategoryRecords(id: String): Observable<ApiResourceList<Leaderboard>>

    fun getDevelopers(): Observable<ApiResourceList<Developer>>

    fun getDeveloper(id: String): Observable<ApiResource<Developer>>

    fun getEngines(): Observable<ApiResourceList<Engine>>

    fun getEngine(id: String): Observable<ApiResource<Engine>>

    fun getGames(): Observable<ApiResourceList<Game>>

    fun getGame(id: String): Observable<ApiResource<Game>>

    fun getGameCategories(id: String): Observable<ApiResourceList<Category>>

    fun getGameLevels(id: String): Observable<ApiResourceList<Level>>

    fun getGameVariables(id: String): Observable<ApiResourceList<Variable>>

    fun getDerivedGames(id: String): Observable<ApiResourceList<Game>>

    fun getGameRecords(id: String): Observable<ApiResourceList<Leaderboard>>

    fun getGameTypes(): Observable<ApiResourceList<GameType>>

    fun getGameType(id: String): Observable<ApiResource<GameType>>

    fun getGenres(): Observable<ApiResourceList<Genre>>

    fun getGenre(id: String): Observable<ApiResource<Genre>>

    fun getGuest(name: String): Observable<ApiResource<Guest>>

    fun getLeaderboardByGameAndCategory(game: String, category: String): Observable<ApiResource<Leaderboard>>

    fun getLeaderboardByGameAndLevelAndCategory(game: String, level: String, category: String): Observable<ApiResource<Leaderboard>>

    fun getLevel(id: String): Observable<ApiResource<Level>>

    fun getLevelCategories(id: String): Observable<ApiResourceList<Category>>

    fun getLevelVariables(id: String): Observable<ApiResourceList<Variable>>

    fun getLevelRecords(id: String): Observable<ApiResourceList<Leaderboard>>

    fun getNotifications(): Observable<ApiResourceList<Notification>>

    fun getPlatforms(): Observable<ApiResourceList<Platform>>

    fun getPlatform(id: String): Observable<ApiResource<Platform>>

    fun getProfile(): Observable<ApiResource<User>>

    fun getPublishers(): Observable<ApiResourceList<Publisher>>

    fun getPublisher(id: String): Observable<ApiResource<Publisher>>

    fun getRegions(): Observable<ApiResourceList<Region>>

    fun getRegion(id: String): Observable<ApiResource<Region>>

    fun getRuns(): Observable<ApiResourceList<Run>>

    fun getRun(id: String): Observable<ApiResource<Run>>

    fun createRun(run: Run): Observable<ApiResource<Run>>

    fun modifyRunStatus(id: String, status: RunStatus): Observable<ApiResource<Run>>

    fun modifyRunPlayer(id: String, players: List<User>): Observable<ApiResource<Run>>

    fun removeRun(id: String): Observable<ApiResource<Run>>

    fun getSeries(): Observable<ApiResourceList<Series>>

    fun getSeries(id: String): Observable<ApiResource<Series>>

    fun getSeriesGames(id: String): Observable<ApiResourceList<Game>>

    fun getUsers(): Observable<ApiResourceList<User>>

    fun getUser(id: String): Observable<ApiResource<User>>

    fun getUserPersonalBests(id: String): Observable<ApiResource<PersonalBest>>

    fun getVariable(id: String): Observable<ApiResource<Variable>>

}
