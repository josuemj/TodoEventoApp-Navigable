package com.example.myapplication.ui.uielements

import Concert
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.navegacion.Model


@Composable
fun favoriteCard(
    concerObject: Concert
){

    val resourceId = if (concerObject.drawableId.isNotEmpty()) {
        val context = LocalContext.current
        context.resources.getIdentifier(concerObject.drawableId, "drawable", context.packageName)
    } else {
        0 // Set a default drawable resource ID or handle empty name
    }

    Card(
        modifier = Modifier
            .width(345.dp)
            .height(395.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .background(Color.Black)
                .fillMaxSize()
        ){
            Text(
                modifier = Modifier.padding(top = 310.dp, start = 15.dp),
                text = concerObject.eventTittle,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                modifier = Modifier.padding(top = 330.dp, start = 15.dp),
                text = concerObject.eventDescription,
                fontSize = 14.sp,
                color = Color.White

            )

            Card(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp

            ){
                Image(
                    painter = painterResource(id = resourceId),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}
