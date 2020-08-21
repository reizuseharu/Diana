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
import javax.inject.Inject

class RxSpeedRunComClient @Inject constructor(private val service: RxSpeedRunComService): RxSpeedRunComApi {

    override fun getCategory(id: String): Observable<ApiResource<Category>> {
        return service.getCategory(id)
    }

    override fun getCategoryVariables(id: String): Observable<ApiResourceList<Variable>> {
        return service.getCategoryVariables(id)
    }

    override fun getCategoryRecords(id: String): Observable<ApiResourceList<Leaderboard>> {
        return service.getCategoryRecords(id)
    }

    override fun getDevelopers(): Observable<ApiResourceList<Developer>> {
        return service.getDevelopers()
    }

    override fun getDeveloper(id: String): Observable<ApiResource<Developer>> {
        return service.getDeveloper(id)
    }

    override fun getEngines(): Observable<ApiResourceList<Engine>> {
        return service.getEngines()
    }

    override fun getEngine(id: String): Observable<ApiResource<Engine>> {
        return service.getEngine(id)
    }

    override fun getGames(): Observable<ApiResourceList<Game>> {
        return service.getGames()
    }

    override fun getGame(id: String): Observable<ApiResource<Game>> {
        return service.getGame(id)
    }

    override fun getGameCategories(id: String): Observable<ApiResourceList<Category>> {
        return service.getGameCategories(id)
    }

    override fun getGameLevels(id: String): Observable<ApiResourceList<Level>> {
        return service.getGameLevels(id)
    }

    override fun getGameVariables(id: String): Observable<ApiResourceList<Variable>> {
        return service.getGameVariables(id)
    }

    override fun getDerivedGames(id: String): Observable<ApiResourceList<Game>> {
        return service.getDerivedGames(id)
    }

    override fun getGameRecords(id: String): Observable<ApiResourceList<Leaderboard>> {
        return service.getGameRecords(id)
    }

    override fun getGameTypes(): Observable<ApiResourceList<GameType>> {
        return service.getGameTypes()
    }

    override fun getGameType(id: String): Observable<ApiResource<GameType>> {
        return service.getGameType(id)
    }

    override fun getGenres(): Observable<ApiResourceList<Genre>> {
        return service.getGenres()
    }

    override fun getGenre(id: String): Observable<ApiResource<Genre>> {
        return service.getGenre(id)
    }

    override fun getGuest(name: String): Observable<ApiResource<Guest>> {
        return service.getGuest(name)
    }

    override fun getLeaderboardByGameAndCategory(game: String, category: String): Observable<ApiResource<Leaderboard>> {
        return service.getLeaderboardByGameAndCategory(game, category)
    }

    override fun getLeaderboardByGameAndLevelAndCategory(game: String, level: String, category: String): Observable<ApiResource<Leaderboard>> {
        return service.getLeaderboardByGameAndLevelAndCategory(game, level, category)
    }

    override fun getLevel(id: String): Observable<ApiResource<Level>> {
        return service.getLevel(id)
    }

    override fun getLevelCategories(id: String): Observable<ApiResourceList<Category>> {
        return service.getLevelCategories(id)
    }

    override fun getLevelVariables(id: String): Observable<ApiResourceList<Variable>> {
        return service.getLevelVariables(id)
    }

    override fun getLevelRecords(id: String): Observable<ApiResourceList<Leaderboard>> {
        return service.getLevelRecords(id)
    }

    override fun getNotifications(): Observable<ApiResourceList<Notification>> {
        return service.getNotifications()
    }

    override fun getPlatforms(): Observable<ApiResourceList<Platform>> {
        return service.getPlatforms()
    }

    override fun getPlatform(id: String): Observable<ApiResource<Platform>> {
        return service.getPlatform(id)
    }

    override fun getProfile(): Observable<ApiResource<User>> {
        return service.getProfile()
    }

    override fun getPublishers(): Observable<ApiResourceList<Publisher>> {
        return service.getPublishers()
    }

    override fun getPublisher(id: String): Observable<ApiResource<Publisher>> {
        return service.getPublisher(id)
    }

    override fun getRegions(): Observable<ApiResourceList<Region>> {
        return service.getRegions()
    }

    override fun getRegion(id: String): Observable<ApiResource<Region>> {
        return service.getRegion(id)
    }

    override fun getRuns(): Observable<ApiResourceList<Run>> {
        return service.getRuns()
    }

    override fun getRun(id: String): Observable<ApiResource<Run>> {
        return service.getRun(id)
    }

    override fun createRun(run: Run): Observable<ApiResource<Run>> {
        return service.createRun(run)
    }

    override fun modifyRunStatus(id: String, status: RunStatus): Observable<ApiResource<Run>> {
        return service.modifyRunStatus(id, status)
    }

    override fun modifyRunPlayer(id: String, players: List<User>): Observable<ApiResource<Run>> {
        return service.modifyRunPlayer(id, players)
    }

    override fun removeRun(id: String): Observable<ApiResource<Run>> {
        return service.removeRun(id)
    }

    override fun getSeries(): Observable<ApiResourceList<Series>> {
        return service.getSeries()
    }

    override fun getSeries(id: String): Observable<ApiResource<Series>> {
        return service.getSeries(id)
    }

    override fun getSeriesGames(id: String): Observable<ApiResourceList<Game>> {
        return service.getSeriesGames(id)
    }

    override fun getUsers(): Observable<ApiResourceList<User>> {
        return service.getUsers()
    }

    override fun getUser(id: String): Observable<ApiResource<User>> {
        return service.getUser(id)
    }

    override fun getUserPersonalBests(id: String): Observable<ApiResource<PersonalBest>> {
        return service.getUserPersonalBests(id)
    }

    override fun getVariable(id: String): Observable<ApiResource<Variable>> {
        return service.getVariable(id)
    }

}
