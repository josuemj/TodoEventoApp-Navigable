package com.example.myapplication.ui.details

import Concert
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.ui.favorites.Favorites_class
import com.example.myapplication.ui.uielements.MyTab


@Composable
fun detailsScren(
//
    place : String,
    tittle : String,
    date : String,
    time : String,
    subTittle : String,
    eventDescription:String,
    navController: NavController,
    drawable: String,
){

    val resourceId = if (drawable.isNotEmpty()) {
        val context = LocalContext.current
        context.resources.getIdentifier(drawable, "drawable", context.packageName)
    } else {
        0 // Set a default drawable resource ID or handle empty name
    }

    Column {Column(
        modifier = Modifier
            .fillMaxSize()
            .weight(1f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFfbd9e5))
                .weight(1f)
        ) {

            //IDetail Image
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = resourceId),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Text(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(10.dp)
                    .background(Color.White)
                    .padding(
                        start = 4.dp,
                        top = 4.dp,
                        end = 4.dp,
                        bottom = 4.dp
                    ), // Add negative padding values here
                fontSize = 16.sp,
                text = place,
                color = Color.Black
            )
        }

        //Second Box
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .weight(1f)
        ) {

            Column() {
                Text(
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 20.dp),
                    fontSize = 22.sp,
                    text = tittle,
                )
                //Row Information

                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .padding(start = 10.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(id = R.drawable.calendaricon),
                        contentDescription = null
                    )

                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically),
                        text = date,
                        fontSize = 16.sp
                    )

                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 250.dp),
                        text = time,
                        fontSize = 16.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp)
                ) {
                    Column() {
                        Text(
                            modifier = Modifier.padding(start = 12.dp, bottom = 5.dp),
                            text =subTittle,
                            fontSize = 18.sp

                        )

                        //Event Description text
                        Text(
                            modifier = Modifier.padding(start = 12.dp, end = 20.dp),
                            text = eventDescription,
                            fontSize = 14.sp
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Button(

                        onClick = {
                            var currentConcert = Concert(drawable,tittle,subTittle)

                            if(currentConcert in Favorites_class.favoritesList){
                            }else{
                                Favorites_class.favoritesList.add(currentConcert)
                            }

                                  },

                        modifier = Modifier
                            .width(170.dp)
                            .padding(end = 5.dp)
                            .height(40.dp),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(Color(0xFFEBD0F9))
                    ) {
                        Text(
                            text = "Favorite",
                            color = Color.Black
                        )
                    }

                    //Buy Button
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(170.dp)
                            .padding(start = 5.dp)
                            .height(40.dp),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(Color(0xFFEBD0F9))
                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }

                }

            }

        }
    }
        MyTab(navController)
    }
}

