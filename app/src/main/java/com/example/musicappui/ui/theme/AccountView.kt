package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicappui.R


@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {


            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "account",

                    modifier = Modifier.padding(end = 8.dp)
                )

                Column {
                    Text("Harsh Pidurkar")
                    Text("@hpspotify")
                }


                Spacer(modifier = Modifier.padding(start = 228.dp))
                IconButton(onClick = { },modifier = Modifier.weight(1f)){
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null
                    )


                }
            }




        Row(modifier = Modifier.padding(16.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_library_music_24),
                contentDescription = "My Music",
                modifier = Modifier.padding(end = 8.dp)
            )


            Text(text = "My Music")
        }
        Divider()
    }
}


@Preview
@Composable
fun PreviewAccountView(){
    MusicAppUiTheme {
        AccountView()
    }
}