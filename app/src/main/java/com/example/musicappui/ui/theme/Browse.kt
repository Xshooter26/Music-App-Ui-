package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun Browse() {
    val categories = listOf("Popular", "Phonk", "Workout", "Running","Podcasts", "Yoga")


    LazyVerticalGrid(GridCells.Fixed(2),modifier = Modifier.fillMaxSize()){
                    items(categories) { cat ->
                        BrowserItem(cat = cat, drawable = R.drawable.baseline_library_music_24)

                    }


        }
    }

