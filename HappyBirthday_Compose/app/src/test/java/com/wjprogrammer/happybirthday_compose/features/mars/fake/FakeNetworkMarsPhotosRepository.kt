package com.wjprogrammer.happybirthday_compose.features.marsphotos.fake

import com.wjprogrammer.happybirthday_compose.features.marsphotos.data.MarsPhotosRepository
import com.wjprogrammer.happybirthday_compose.features.marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}