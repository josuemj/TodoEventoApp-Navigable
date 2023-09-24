package com.example.myapplication.ui.concerts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.navegacion.Model

@Composable
fun concertCard(
    painter: Painter,
    contentDescription: String,

    //Event data
    place:String,
    eventTittle: String,
    date:String,
    eventTime:String,
    eventSubtittle:String,
    eventDescription: String,
    navController: NavController
){
    Card(
        modifier = Modifier
            .width(195.dp)
            .height(245.dp)
            .padding(10.dp)
            .clickable {
                navController.navigate(
                    Model.detailsScren.withArgs(
                    place,
                    eventTittle,
                    date,
                    eventTime,
                    eventSubtittle,
                    eventDescription
                ))
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .background(Color(0xFFfbd9e5))
                .fillMaxSize()
        ){
            Text(
                modifier = Modifier.padding(top = 160.dp, start = 15.dp),
                text = eventTittle,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(top = 180.dp, start = 15.dp),
                text = eventSubtittle,
                fontSize = 14.sp,
            )

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp

            ){
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}