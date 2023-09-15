package com.example.myapplication.ui.tab

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.material.*
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.navegacion.Model


@Composable
fun MyTab(navController: NavController){
    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFfbd9e5)))
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(55.dp)
        .background(Color(0xFFf3ecf6)),
        contentAlignment = Alignment.Center,
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            //Favorites tab button
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
            )
            {
                Icon(
                    painter = painterResource(id = R.drawable.favoritesicon),
                    contentDescription = null,
                    modifier = Modifier.width(30.dp).height(50.dp)
                )

            }

            //Home tab Button
            IconButton(
                onClick = { navController.navigate(Model.Menu.route) },
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
            )
            {
                Icon(
                    painter = painterResource(id = R.drawable.homeicon),
                    contentDescription = null,
                    modifier = Modifier.width(30.dp).height(50.dp)
                )
            }

            //User-profile tab button
            IconButton(
                onClick = { navController.navigate(Model.Profile.route) },
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
            )
            {
                Icon(
                    painter = painterResource(id = R.drawable.usericon2),
                    contentDescription = null,
                    modifier = Modifier.width(30.dp).height(50.dp)
                )
            }

            
        }
    }
}