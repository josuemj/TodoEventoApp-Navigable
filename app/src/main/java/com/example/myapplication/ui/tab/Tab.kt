package com.example.myapplication.ui.tab

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tab(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(40.dp)
        .background(Color.Black)
        .border(1.dp, Color.Green),
        contentAlignment = Alignment.Center,
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "Icon 1",
                fontSize = 16.sp,
                color = Color.White
            )

            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "Icon 2",
                fontSize = 16.sp,
                color = Color.White
            )

            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "Icon 3",
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}