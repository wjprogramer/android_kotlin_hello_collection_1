package com.wjprogrammer.happybirthday_compose.features.marsphotos.fake

import com.wjprogrammer.happybirthday_compose.features.marsphotos.model.MarsPhoto
import com.wjprogrammer.happybirthday_compose.features.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}