package com.example.myapplication.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Menu
import com.example.myapplication.ui.profile.Profile

@Preview
@Composable
fun navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController,  startDestination = Model.Menu.route){

       composable(route = Model.Menu.route){
           Menu(navController = navController)
        }

        composable(route = Model.Profile.route){
            Profile(navController = navController)
        }
    }
}