package com.biggerthannull.plumbbristol.ui.views.composables.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biggerthannull.plumbbristol.domain.usecase.models.BathroomOverview
import com.biggerthannull.plumbbristol.ui.theme.PlumbBristolTheme

@Composable
fun PrimaryListComponent(data: List<BathroomOverview>) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(items = data, itemContent = { listItem ->
            PrimaryListItemComponent(data = listItem)
        })
    }
}

@Preview
@Composable
fun PrimaryListComponentPreview() {
    PlumbBristolTheme {
        PrimaryListComponent(listOf(BathroomOverview(
            title = "I am a title",
            coverImage = "http://www.plumbbristol.co.uk/uploads/1/0/8/9/10898263/1410295243.jpg"
        )))
    }
}