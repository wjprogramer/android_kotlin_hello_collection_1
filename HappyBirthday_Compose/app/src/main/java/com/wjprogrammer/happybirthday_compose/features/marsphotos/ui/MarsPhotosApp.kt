
package com.wjprogrammer.happybirthday_compose.features.marsphotos.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wjprogrammer.happybirthday_compose.R
import com.wjprogrammer.happybirthday_compose.features.marsphotos.ui.screens.HomeScreen
import com.wjprogrammer.happybirthday_compose.features.marsphotos.ui.screens.MarsViewModel

@Composable
fun MarsPhotosApp(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name)) }) }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colors.background
        ) {
            val marsViewModel: MarsViewModel =
                viewModel(factory = MarsViewModel.Factory)
            HomeScreen(
                marsUiState = marsViewModel.marsUiState,
                retryAction = marsViewModel::getMarsPhotos
            )
        }
    }
}
