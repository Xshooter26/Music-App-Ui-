package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun Library() {
    LazyColumn() {
        items(libraries) { lib ->

            LibItem(lib = lib)
        }
    }
}


@Composable
fun LibItem(lib: Lib) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row{
                Icon(painter = painterResource(id =lib.icon),contentDescription =lib.name,
                Modifier.padding(horizontal = 8.dp))
                Text(text = lib.name, modifier = Modifier.padding(1.dp), fontWeight = FontWeight.Bold)
            }

            //here is the Spacebetween is applied
            Icon(imageVector = Icons.Default.KeyboardArrowRight,contentDescription = null)


        }

        Divider(color = Color.Cyan)

    }
}