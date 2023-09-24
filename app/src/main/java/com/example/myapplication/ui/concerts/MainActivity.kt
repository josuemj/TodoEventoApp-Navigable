package com.example.myapplication

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.ui.concerts.concertCard
import com.example.myapplication.ui.uielements.MyTab
import topBar

@Composable
fun Menu(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        topBar()

        Column(
            modifier = Modifier
                .height(500.dp)
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {

            Text(
                modifier = Modifier.padding(start = 12.dp, end = 180.dp, top = 10.dp),
                text = "All concerts",
                fontSize = 18.sp
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.deadmau),
                    contentDescription = "",

                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "20-11-24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = "Long event Description",
                    navController = navController
                )

                concertCard(
                    painter = painterResource(id = R.drawable.oliver),
                    contentDescription = "",
                    place = "New York Broklyn",
                    eventTittle = "Oliver Heldens set",
                    date = "10-10-24",
                    eventTime = "11:00 PM",
                    eventSubtittle = "Just released 10 out of 10 at US",
                    eventDescription = "Oliver Heldens es un rapero, DJ y productor neerlandés. " +
                            "Es uno de los máximos referentes " +
                            "del nuevo género conocido como Deep house y Future house.",
                    navController = navController
                )

                concertCard(
                    painter = painterResource(id = R.drawable.garrix),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

            }

            //Row2
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.billie),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

                concertCard(
                    painter = painterResource(id = R.drawable.tisto),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

                concertCard(
                    painter = painterResource(id = R.drawable.guetta),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

            }

            //Row 3
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.miko),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

                concertCard(
                    painter = painterResource(id = R.drawable.bunny),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

                concertCard(
                    painter = painterResource(id = R.drawable.dualipa),
                    contentDescription = "",
                    place = "Chicago",
                    eventTittle = "Deadmau full set",
                    date = "10/10/24",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Cube V3 Relase",
                    eventDescription = ".................",
                    navController = navController
                )

            }

        }
        MyTab(navController)
    }
}





