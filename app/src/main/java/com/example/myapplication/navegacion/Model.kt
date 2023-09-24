package com.example.myapplication.navegacion

sealed class Model(val route:String){

    object Menu : Model("menu_home")
    object Profile : Model("profile_screen")
    object detailsScren : Model("details_screen")
    object Favorites : Model("favorires_screen")

    fun withArgs(vararg args: String):String{
        return buildString {
            append(route)
            args.forEach {
                arg->append("/$arg")
            }
        }
    }

}
