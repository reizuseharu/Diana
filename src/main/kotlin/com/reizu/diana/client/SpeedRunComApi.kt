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

interface SpeedRunComApi {

    // - Add query parameters
    // - Implement pagination
    // - Verify all embedded variables have methods

    fun getCategory(id: String): ApiResource<Category>

    fun getCategoryVariables(id: String): ApiResourceList<Variable>

    fun getCategoryRecords(id: String): ApiResourceList<Leaderboard>

    fun getDevelopers(): ApiResourceList<Developer>

    fun getDeveloper(id: String): ApiResource<Developer>

    fun getEngines(): ApiResourceList<Engine>

    fun getEngine(id: String): ApiResource<Engine>

    fun getGames(): ApiResourceList<Game>

    fun getGame(id: String): ApiResource<Game>

    fun getGameCategories(id: String): ApiResourceList<Category>

    fun getGameLevels(id: String): ApiResourceList<Level>

    fun getGameVariables(id: String): ApiResourceList<Variable>

    fun getDerivedGames(id: String): ApiResourceList<Game>

    fun getGameRecords(id: String): ApiResourceList<Leaderboard>

    fun getGameTypes(): ApiResourceList<GameType>

    fun getGameType(id: String): ApiResource<GameType>

    fun getGenres(): ApiResourceList<Genre>

    fun getGenre(id: String): ApiResource<Genre>

    fun getGuest(name: String): ApiResource<Guest>

    fun getLeaderboardByGameAndCategory(game: String, category: String): ApiResource<Leaderboard>

    fun getLeaderboardByGameAndLevelAndCategory(game: String, level: String, category: String): ApiResource<Leaderboard>

    fun getLevel(id: String): ApiResource<Level>

    fun getLevelCategories(id: String): ApiResourceList<Category>

    fun getLevelVariables(id: String): ApiResourceList<Variable>

    fun getLevelRecords(id: String): ApiResourceList<Leaderboard>

    fun getNotifications(): ApiResourceList<Notification>

    fun getPlatforms(): ApiResourceList<Platform>

    fun getPlatforms(offset: Int, max: Int): ApiResourceList<Platform>

    fun getPlatform(id: String): ApiResource<Platform>

    fun getProfile(): ApiResource<User>

    fun getPublishers(): ApiResourceList<Publisher>

    fun getPublisher(id: String): ApiResource<Publisher>

    fun getRegions(): ApiResourceList<Region>

    fun getRegion(id: String): ApiResource<Region>

    fun getRuns(): ApiResourceList<Run>

    fun getRuns(offset: Int, max: Int, gameId: String, categoryId: String): ApiResourceList<Run>

    fun getRun(id: String): ApiResource<Run>

    fun createRun(run: Run): ApiResource<Run>

    fun modifyRunStatus(id: String, status: RunStatus): ApiResource<Run>

    fun modifyRunPlayer(id: String, players: List<User>): ApiResource<Run>

    fun removeRun(id: String): ApiResource<Run>

    fun getSeries(): ApiResourceList<Series>

    fun getSeries(id: String): ApiResource<Series>

    fun getSeriesGames(id: String): ApiResourceList<Game>

    fun getUsers(): ApiResourceList<User>

    fun getUser(id: String): ApiResource<User>

    fun getUserPersonalBests(id: String): ApiResource<PersonalBest>

    fun getVariable(id: String): ApiResource<Variable>

}
