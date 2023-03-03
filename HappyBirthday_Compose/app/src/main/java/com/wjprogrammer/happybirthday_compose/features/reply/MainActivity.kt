package com.wjprogrammer.happybirthday_compose.features.reply

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
