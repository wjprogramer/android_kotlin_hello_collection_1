package com.wjprogrammer.happybirthday_compose.my_codelab_practices.business_card_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import com.wjprogrammer.happybirthday_compose.R
import androidx.compose.foundation.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

// https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card

private val primaryColor = Color(0xFF3ddc84)

@Composable
fun Divider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(
                color = Color(0xFF526E7B)
            )
    )
}

@Composable
fun ListTile(
    title: String,
    imageVector: ImageVector,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            modifier = Modifier.absolutePadding(
                left = 48.dp,
                right = 16.dp,
            ),
            imageVector = imageVector,
            contentDescription = stringResource(R.string.share),
//                tint = MaterialTheme.colors.onPrimary
            tint = primaryColor
        )
        Text(title, color = Color.White)
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.android_icon),
                contentDescription = "",
                modifier = Modifier
                    .width(100.dp),
            )
            Text(
                "Jennifer Doe",
                modifier = Modifier
                    .padding(vertical = 16.dp),
                color = Color.White,
                fontSize = 48.sp,
            )
            Text(
                "Android Developer Extraordinaire",
                modifier = Modifier,
                color = primaryColor,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Divider()
        ListTile(
            title = "+11 (123) 444 555 666",
            imageVector = Icons.Filled.Phone,
        )
        Divider()
        ListTile(
            title = "@AndroidDev",
            imageVector = Icons.Filled.Share,
        )
        Divider()
        ListTile(
            title = "jen.doe@android.com",
            imageVector = Icons.Filled.Mail,
        )
        Spacer(
            modifier = Modifier
                .height(36.dp)
        )
    }
}





