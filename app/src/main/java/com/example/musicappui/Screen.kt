package com.example.musicappui


import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home

sealed class Screen(val title : String , val route : String) {


    sealed class BottomScreen(val bTitle : String, val bRoute : String,
                              @DrawableRes val Icon : Int) : Screen(bTitle,bRoute){

        object Home : BottomScreen(
            "Home",
            "home",
            R.drawable.baseline_home_24
        )

        object Library : BottomScreen(
            "Library",
            "library",
            R.drawable.baseline_library_add_24
        )
        object Browse : BottomScreen(
            "Browse",
            "browse",
            R.drawable.round_window_24
        )
                              }
    sealed class DrawerScreen(val dTitle : String, val dRoute : String,
                              @DrawableRes val Icon : Int) : Screen(dTitle,dRoute){


        object Account : DrawerScreen(
            "Account",
            "account",
            R.drawable.ic_account
        )

        object Subscription : DrawerScreen(
            "Subscription",
            "subscribe",
            R.drawable.ic_subscribe
        )
        object AddAccount : DrawerScreen(
            " Add Account",
            "add_account",
            R.drawable.ic_addaccount
        )
    }
}

val screenInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount

)

val screenInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Library,
    Screen.BottomScreen.Browse


)