package com.biggerthannull.plumbbristol.ui.views.composables.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biggerthannull.plumbbristol.ui.resources.ImageLoader
import com.biggerthannull.plumbbristol.ui.resources.ImageLoaderImpl
import com.biggerthannull.plumbbristol.ui.theme.PlumbBristolTheme

@Composable
fun GalleryHorizontalListComponent(data: List<String>) {
    val imageLoader: ImageLoader = ImageLoaderImpl()
    LazyRow {
        items(
            items = data,
            itemContent = {url ->
                imageLoader.Load(
                    url = url,
                    modifier = Modifier.size(height = 250.dp, width = 300.dp),
                    contentDescription = null,
                    scale = ContentScale.FillBounds
                )
            }
        )
    }
}

@Preview
@Composable
fun GalleryHorizontalListComponentPreview() {
    PlumbBristolTheme {
        GalleryHorizontalListComponent(listOf(
            "https://curator-assets.b-cdn.net/54c93d3b-d832-4eee-bb76-5772e8e3f8c1/186828319.jpg",
            "https://curator-assets.b-cdn.net/54c93d3b-d832-4eee-bb76-5772e8e3f8c1/186828319.jpg",
            "https://curator-assets.b-cdn.net/54c93d3b-d832-4eee-bb76-5772e8e3f8c1/186828319.jpg"
        ))
    }
}