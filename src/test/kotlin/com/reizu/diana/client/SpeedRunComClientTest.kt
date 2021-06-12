package com.reizu.diana.client

import com.nhaarman.mockitokotlin2.whenever
import com.reizu.diana.model.ApiResource
import com.reizu.diana.model.Category
import com.reizu.diana.model.Developer
import com.reizu.diana.model.PlayerCategory
import com.reizu.diana.utility.CallFake
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import retrofit2.Call

@ExtendWith(MockitoExtension::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SpeedRunComClientTest {

    private val validId: String = "goddess-of-the-hunt"

    private val validCategoryId: String = validId
    private val validDeveloperId: String = validId

    private val validCategory = ApiResource(Category(
        id = validCategoryId,
        name = "",
        webLink = "",
        type = "",
        rules = "",
        players = PlayerCategory(
            type = "",
            value = 0
        ),
        miscellaneous = false,
        links = emptyList()
    ))

    private val validDeveloper = ApiResource(Developer(
        id = validDeveloperId,
        name = "",
        links = emptyList()
    ))

    private val validCategoryCall: Call<ApiResource<Category>> = CallFake.buildSuccess(validCategory)
    private val validDeveloperCall: Call<ApiResource<Developer>> = CallFake.buildSuccess(validDeveloper)

    @Mock
    private lateinit var speedRunComService: SpeedRunComService

    @InjectMocks
    private lateinit var speedRunComClient: SpeedRunComClient

    @BeforeAll
    fun setUp() {}

    @Nested
    inner class Success {

        @Test
        fun `given valid categoryId - when getCategory - then return valid category`() {
            val expectedCategory: ApiResource<Category> = validCategory

            // ! Found the problem: Dagger is passing in a different Service

            whenever(speedRunComService.getCategory(validCategoryId)).thenReturn(validCategoryCall)

            val actualCategory: ApiResource<Category> = speedRunComClient.getCategory(validCategoryId)

            actualCategory shouldEqual expectedCategory
        }

        @Test
        fun `given valid categoryId - when getCategoryVariables - then return valid variables`() {
        }

        @Test
        fun `given valid categoryId - when getCategoryRecords - then return valid leaderboards`() {
        }

        @Test
        fun `given valid XXXId - when getDevelopers - then return valid YYY`() {
        }

        @Test
        fun `given valid developerId - when getDeveloper - then return valid developer`() {
            val expectedDeveloper: ApiResource<Developer> = validDeveloper

            whenever(speedRunComService.getDeveloper(validDeveloperId)).thenReturn(validDeveloperCall)

            val actualDeveloper: ApiResource<Developer> = speedRunComClient.getDeveloper(validDeveloperId)

            actualDeveloper shouldEqual expectedDeveloper
        }

        @Test
        fun `given valid XXXId - when getEngines - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getEngine - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGames - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGame - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGameCategories - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGameLevels - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGameVariables - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getDerivedGames - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGameRecords - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGameTypes - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGameType - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGenres - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGenre - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getGuest - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getLeaderboardByGameAndCategory - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getLeaderboardByGameAndLevelAndCategory - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getLevel - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getLevelCategories - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getLevelVariables - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getLevelRecords - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getNotifications - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getPlatforms - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getPlatform - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getProfile - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getPublishers - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getPublisher - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getRegions - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getRegion - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getRuns - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getRun - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when createRun - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when modifyRunStatus - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when modifyRunPlayer - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when removeRun - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getSeries - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when testGetSeries - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getSeriesGames - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getUsers - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getUser - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getUserPersonalBests - then return valid YYY`() {
        }

        @Test
        fun `given valid XXXId - when getVariable - then return valid YYY`() {
        }

    }

}
