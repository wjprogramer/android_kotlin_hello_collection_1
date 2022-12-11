package com.wjprogrammer.happybirthday_compose.features.marsphotos.fake

import com.wjprogrammer.happybirthday_compose.features.marsphotos.model.MarsPhoto

object FakeDataSource {

    const val idOne = "img1"
    const val idTwo = "img2"
    const val imgOne = "url.one"
    const val imgTwo = "url.two"
    val photosList = listOf(
        MarsPhoto(
            id = idOne,
            imgSrc = imgOne
        ),
        MarsPhoto(
            id = idTwo,
            imgSrc = imgTwo
        )
    )
}