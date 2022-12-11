package com.wjprogrammer.happybirthday_compose.features.reply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import com.wjprogrammer.happybirthday_compose.features.reply.data.MailboxType
import com.wjprogrammer.happybirthday_compose.features.reply.data.local.LocalEmailsDataProvider
import com.wjprogrammer.happybirthday_compose.features.reply.ui.ReplyApp
import com.wjprogrammer.happybirthday_compose.features.reply.ui.theme.ReplyTheme

@Preview(showBackground = true)
@Composable
fun ReplyAppCompactPreview() {
    ReplyTheme {
        ReplyApp(
            windowSize = WindowWidthSizeClass.Compact,
        )
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
fun ReplyAppMediumPreview() {
    ReplyTheme {
        ReplyApp(
            windowSize = WindowWidthSizeClass.Medium,
        )
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun ReplyAppExpandedPreview() {
    ReplyTheme {
        ReplyApp(
            windowSize = WindowWidthSizeClass.Expanded,
        )
    }
}
