package com.example.myapplication.navegacion

sealed class Model(val route:String){

    object Menu : Model("menu_home")
    object Profile : Model("profile_screen")

}
