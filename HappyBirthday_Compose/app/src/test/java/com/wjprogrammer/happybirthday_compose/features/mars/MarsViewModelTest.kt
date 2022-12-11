package com.wjprogrammer.happybirthday_compose.features.mars

import com.wjprogrammer.happybirthday_compose.features.marsphotos.fake.FakeDataSource
import com.wjprogrammer.happybirthday_compose.features.marsphotos.fake.FakeNetworkMarsPhotosRepository
import com.wjprogrammer.happybirthday_compose.features.marsphotos.rules.TestDispatcherRule
import com.wjprogrammer.happybirthday_compose.features.marsphotos.ui.screens.MarsUiState
import com.wjprogrammer.happybirthday_compose.features.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }
}