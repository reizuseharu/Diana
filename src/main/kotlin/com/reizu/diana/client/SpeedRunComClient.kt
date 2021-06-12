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
import com.reizu.diana.utility.result
import javax.inject.Inject

class SpeedRunComClient @Inject constructor(private val service: SpeedRunComService) : SpeedRunComApi {

    override fun getCategory(id: String): ApiResource<Category> {
        return service.getCategory(id).result()
    }

    override fun getCategoryVariables(id: String): ApiResourceList<Variable> {
        return service.getCategoryVariables(id).result()
    }

    override fun getCategoryRecords(id: String): ApiResourceList<Leaderboard> {
        return service.getCategoryRecords(id).result()
    }

    override fun getDevelopers(): ApiResourceList<Developer> {
        return service.getDevelopers().result()
    }

    override fun getDeveloper(id: String): ApiResource<Developer> {
        return service.getDeveloper(id).result()
    }

    override fun getEngines(): ApiResourceList<Engine> {
        return service.getEngines().result()
    }

    override fun getEngine(id: String): ApiResource<Engine> {
        return service.getEngine(id).result()
    }

    override fun getGames(): ApiResourceList<Game> {
        return service.getGames().result()
    }

    override fun getGame(id: String): ApiResource<Game> {
        return service.getGame(id).result()
    }

    override fun getGameCategories(id: String): ApiResourceList<Category> {
        return service.getGameCategories(id).result()
    }

    override fun getGameLevels(id: String): ApiResourceList<Level> {
        return service.getGameLevels(id).result()
    }

    override fun getGameVariables(id: String): ApiResourceList<Variable> {
        return service.getGameVariables(id).result()
    }

    override fun getDerivedGames(id: String): ApiResourceList<Game> {
        return service.getDerivedGames(id).result()
    }

    override fun getGameRecords(id: String): ApiResourceList<Leaderboard> {
        return service.getGameRecords(id).result()
    }

    override fun getGameTypes(): ApiResourceList<GameType> {
        return service.getGameTypes().result()
    }

    override fun getGameType(id: String): ApiResource<GameType> {
        return service.getGameType(id).result()
    }

    override fun getGenres(): ApiResourceList<Genre> {
        return service.getGenres().result()
    }

    override fun getGenre(id: String): ApiResource<Genre> {
        return service.getGenre(id).result()
    }

    override fun getGuest(name: String): ApiResource<Guest> {
        return service.getGuest(name).result()
    }

    override fun getLeaderboardByGameAndCategory(game: String, category: String): ApiResource<Leaderboard> {
        return service.getLeaderboardByGameAndCategory(game, category).result()
    }

    override fun getLeaderboardByGameAndLevelAndCategory(game: String, level: String, category: String): ApiResource<Leaderboard> {
        return service.getLeaderboardByGameAndLevelAndCategory(game, level, category).result()
    }

    override fun getLevel(id: String): ApiResource<Level> {
        return service.getLevel(id).result()
    }

    override fun getLevelCategories(id: String): ApiResourceList<Category> {
        return service.getLevelCategories(id).result()
    }

    override fun getLevelVariables(id: String): ApiResourceList<Variable> {
        return service.getLevelVariables(id).result()
    }

    override fun getLevelRecords(id: String): ApiResourceList<Leaderboard> {
        return service.getLevelRecords(id).result()
    }

    override fun getNotifications(): ApiResourceList<Notification> {
        return service.getNotifications().result()
    }

    override fun getPlatforms(): ApiResourceList<Platform> {
        return service.getPlatforms().result()
    }

    override fun getPlatform(id: String): ApiResource<Platform> {
        return service.getPlatform(id).result()
    }

    override fun getProfile(): ApiResource<User> {
        return service.getProfile().result()
    }

    override fun getPublishers(): ApiResourceList<Publisher> {
        return service.getPublishers().result()
    }

    override fun getPublisher(id: String): ApiResource<Publisher> {
        return service.getPublisher(id).result()
    }

    override fun getRegions(): ApiResourceList<Region> {
        return service.getRegions().result()
    }

    override fun getRegion(id: String): ApiResource<Region> {
        return service.getRegion(id).result()
    }

    override fun getRuns(): ApiResourceList<Run> {
        return service.getRuns().result()
    }

    override fun getRun(id: String): ApiResource<Run> {
        return service.getRun(id).result()
    }

    override fun createRun(run: Run): ApiResource<Run> {
        return service.createRun(run).result()
    }

    override fun modifyRunStatus(id: String, status: RunStatus): ApiResource<Run> {
        return service.modifyRunStatus(id, status).result()
    }

    override fun modifyRunPlayer(id: String, players: List<User>): ApiResource<Run> {
        return service.modifyRunPlayer(id, players).result()
    }

    override fun removeRun(id: String): ApiResource<Run> {
        return service.removeRun(id).result()
    }

    override fun getSeries(): ApiResourceList<Series> {
        return service.getSeries().result()
    }

    override fun getSeries(id: String): ApiResource<Series> {
        return service.getSeries(id).result()
    }

    override fun getSeriesGames(id: String): ApiResourceList<Game> {
        return service.getSeriesGames(id).result()
    }

    override fun getUsers(): ApiResourceList<User> {
        return service.getUsers().result()
    }

    override fun getUser(id: String): ApiResource<User> {
        return service.getUser(id).result()
    }

    override fun getUserPersonalBests(id: String): ApiResource<PersonalBest> {
        return service.getUserPersonalBests(id).result()
    }

    override fun getVariable(id: String): ApiResource<Variable> {
        return service.getVariable(id).result()
    }

}
