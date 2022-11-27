package com.wjprogrammer.happybirthday_compose

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.wjprogrammer.happybirthday_compose.ui.theme.HappyBirthday_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthday_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage( "Happy Birthday Sam!", "- from Emma")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column {
        Text(
            text = message,
            // UI elements in Android apps use two different units of measurement:
            // 1. scalable pixels (SP): By default, the SP unit is the same size as the DP unit, but it resizes based on the user's preferred text size under phone settings
            // 2. density-independent pixels (DP)
            fontSize = 40.sp,
            modifier = Modifier.background(color = Color.Green)
        )
        Text(
            text = from,
            fontSize = 24.sp
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
        BirthdayGreetingWithText( "Happy Birthday Sam!", "- from Emma")
    }
}

@Preview(name = "This is preview", showBackground = true, showSystemUi = false)
@Composable
fun BirthdayCardPreview() {
    HappyBirthday_ComposeTheme {
        BirthdayGreetingWithImage( "Happy Birthday Sam!", "- from Emma")

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