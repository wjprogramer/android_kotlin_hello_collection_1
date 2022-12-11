package com.wjprogrammer.happybirthday_compose.features.birthday

import android.os.Bundle
// AndroidX (Android Extension)
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wjprogrammer.happybirthday_compose.features.birthday.ui.theme.HappyBirthday_ComposeTheme
import com.wjprogrammer.happybirthday_compose.R

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = message,
            // UI elements in Android apps use two different units of measurement:
            // 1. scalable pixels (SP): By default, the SP unit is the same size as the DP unit, but it resizes based on the user's preferred text size under phone settings
            // 2. density-independent pixels (DP)
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
//                .wrapContentWidth(Alignment.Start)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0x72FFFFFF))
//                .wrapContentWidth(Alignment.End)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)

        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.android_party)

    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message, from)
    }
}

@Preview(name = "This is preview", showBackground = true, showSystemUi = false)
@Composable
fun BirthdayCardPreview() {
    HappyBirthday_ComposeTheme {
        BirthdayGreetingWithImage(stringResource(R.string.happy_birthday_text), stringResource(R.string.signature_text))

        // Trailing lambda syntax
//        Row {
//            Text(text = "Hello")
//            Text(text = "World")
//        }
//        Row(
//            content = {
//                Text("Some text")
//                Text("Some more text")
//                Text("Last text")
//            }
//        )
    }
}