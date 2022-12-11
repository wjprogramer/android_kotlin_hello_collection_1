package com.wjprogrammer.happybirthday_compose.features.marsphotos.data

import com.wjprogrammer.happybirthday_compose.features.marsphotos.model.MarsPhoto
import com.wjprogrammer.happybirthday_compose.features.marsphotos.network.MarsApiService

/**
 * Repository that fetch mars photos list from marsApi.
 */
interface MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi */
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

/**
 * Network Implementation of Repository that fetch mars photos list from marsApi.
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi*/
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
