package com.biggerthannull.plumbbristol.ui.views.composables.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.biggerthannull.plumbbristol.R
import com.biggerthannull.plumbbristol.ui.theme.PlumbBristolTheme
import com.biggerthannull.plumbbristol.ui.views.composables.components.PrimaryListComponent
import com.biggerthannull.plumbbristol.ui.views.viewmodels.state.HomeScreenUIState

@Composable
fun HomeScreen(uiState: HomeScreenUIState) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {
        if (uiState.bathrooms.isNotEmpty()) {
            PrimaryListComponent(data = uiState.bathrooms)
        } else {
            Text(text = stringResource(id = R.string.generic_error_label))
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    PlumbBristolTheme {
        HomeScreen(HomeScreenUIState())
    }
}