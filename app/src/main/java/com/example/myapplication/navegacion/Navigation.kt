package com.example.myapplication.navegacion

import Favorites
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.Menu
import com.example.myapplication.ui.details.detailsScren
import com.example.myapplication.ui.favorites.Favorites_class
import com.example.myapplication.ui.profile.Profile

@Preview
@Composable
fun navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController,  startDestination = Model.Menu.route){

        //Main screen first one
       composable(route = Model.Menu.route){
           Menu(navController = navController)
        }

        //Profile route
        composable(route = Model.Profile.route){
            Profile(navController = navController)
        }

        //Details screen
        composable(
            route = Model.detailsScren.route+"/{place}/{eventTittle}/{date}/{eventTime}/{eventSubtittle}/{eventDescription}/{eventIDImage}",
            arguments = listOf(
                navArgument("place"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("eventTittle"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },

                navArgument("date"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },

                navArgument("eventTime"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },

                navArgument("eventSubtittle"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },

                navArgument("eventDescription"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },

                navArgument("eventIDImage"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                }

            )
        ){entry->
            detailsScren(
                place = entry.arguments?.getString("place")!!,
                tittle = entry.arguments?.getString("eventTittle")!!,
                date = entry.arguments?.getString("date")!!,
                time = entry.arguments?.getString("eventTime")!!,
                subTittle = entry.arguments?.getString("eventSubtittle")!!,
                eventDescription = entry.arguments?.getString("eventDescription")!!,
                drawable = entry.arguments?.getString("eventIDImage")!!,
                navController = navController
            )
    }

        composable(route = Model.Favorites.route){
            Favorites(navController)
        }

}
}