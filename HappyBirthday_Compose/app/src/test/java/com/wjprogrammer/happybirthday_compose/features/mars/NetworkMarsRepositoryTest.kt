package com.wjprogrammer.happybirthday_compose.features.mars

import com.wjprogrammer.happybirthday_compose.features.marsphotos.data.NetworkMarsPhotosRepository
import com.wjprogrammer.happybirthday_compose.features.marsphotos.fake.FakeDataSource
import com.wjprogrammer.happybirthday_compose.features.marsphotos.fake.FakeMarsApiService
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}