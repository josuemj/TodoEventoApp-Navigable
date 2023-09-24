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
import com.example.myapplication.ui.favorites.Favorites_class
import com.example.myapplication.ui.uielements.MyTab
import topBar





@Composable
fun Menu(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        topBar("TodoEventos")

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

            //Row 1
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
                    navController = navController,
                    drawableID = R.drawable.deadmau.toString()
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
                    navController = navController,
                    drawableID = R.drawable.oliver.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.garrix),
                    contentDescription = "",
                    place = "RTU Guatemala",
                    eventTittle = "Marin Garrrix",
                    date = "Tomorrow",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Releasgin 'Yottabyte'",
                    eventDescription = "Beyond his music career" +
                            ", Martin Garrix is recognized for his phila" +
                            "thropic efforts and commitment to sustainability. " +
                            "He has actively supported causes such as War Child " +
                            "and The Ocean Cleanup, reflecting his dedication to making " +
                            "a positive impact on the world",
                    navController = navController,
                    drawableID = R.drawable.garrix.toString()
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
                    place = "Toronto",
                    eventTittle = "Billie Eilish",
                    date = "Today",
                    eventTime = "9:00 PM",
                    eventSubtittle = "Bad guy throw back",
                    eventDescription = "Billie Eilish's breakthrough came " +
                            "with her debut single \"Ocean Eyes\" in 2015, which " +
                            "quickly went viral, propelling her to stardom. " +
                            "She released her debut EP, \"Don't Smile at Me,\" " +
                            "in 2017, which included several successful tracks.",
                    navController = navController,
                    drawableID = R.drawable.billie.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.tisto),
                    contentDescription = "",
                    place = "Thailandia",
                    eventTittle = "Tiesto",
                    date = "12-04-25",
                    eventTime = "7:00 PM",
                    eventSubtittle = "Tiesto is back",
                    eventDescription = "Throughout his career, Tiësto's impact on EDM " +
                            "culture has been immeasurable. He has paved the way for countless " +
                            "artists, and his influence continues to shape the electronic music " +
                            ". His dedication to pushing boundaries and delivering unforgettable " +
                            "music experiences has solidified his legendary status in the world of " +
                            "dance music.",
                    navController = navController,
                    drawableID = R.drawable.tisto.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.guetta),
                    contentDescription = "",
                    place = "Singapur",
                    eventTittle = "David Guetta",
                    date = "01-10-27",
                    eventTime = "6:00 PM",
                    eventSubtittle = "Guetta re-designing electro genre",
                    eventDescription = "His albums, including 'Nothing But the Beat' and 'Listen'," +
                            " have been critically acclaimed and have showcased his evolution as an" +
                            " artist. He continues to push boundaries and experiment with new sounds, " +
                            "ensuring his music remains fresh and relevant.",
                    navController = navController,
                    drawableID = R.drawable.guetta.toString()

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
                    place = "San Salvador",
                    eventTittle = "Young Miko",
                    date = "10-10-24",
                    eventTime = "4:00 PM",
                    eventSubtittle = "Will perfon soon 'Wiggy'",
                    eventDescription = "Karol G llamó a una invitada especial a subirse al " +
                            "escenario: la rapera puertorriqueña Young Miko, telonera de su gira " +
                            "internacional. Vestida con un crop top rosa vibrante y pantalones " +
                            "anchos a juego, Young Miko tomó a Karol de la mano mientras ambas " +
                            "interpretaban su exitosa colaboración 'Dispo'",
                    navController = navController,
                    drawableID = R.drawable.miko.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.bunny),
                    contentDescription = "",
                    place = "PR",
                    eventTittle = "Bad Bunny",
                    date = "01-12-23",
                    eventTime = "11:00 PM",
                    eventSubtittle = "Bad Bunny will be back",
                    eventDescription = "Drake teased collaborations with Nicki Minaj and Bad Bunny." +
                            " The latter marks the duo’s first collaboration since 2018’s “MÍA,” where Drak",
                    navController = navController,
                    drawableID = R.drawable.bunny.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.dualipa),
                    contentDescription = "",
                    place = "Mexico DF",
                    eventTittle = "Dua Lipa",
                    date = "10-10-24",
                    eventTime = "3:00 PM",
                    eventSubtittle = "Levitating Tour",
                    eventDescription = "Dua lipa....",
                    navController = navController,
                    drawableID = R.drawable.dualipa.toString()
                )

            }
            //Row 4
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.galantids),
                    contentDescription = "",
                    place = "Brazil",
                    eventTittle = "Galantis",
                    date = "10-10-24",
                    eventTime = "12:00 PM",
                    eventSubtittle = "LIVE NOW",
                    eventDescription = "Galantis i" +
                            "s a Swedish electronic music" +
                            " duo consisting of Christian Karl" +
                            "sson and Linus Eklöw. They are well-known" +
                            "for their contributions to the electronic dan" +
                            "ce music (EDM) genre and have achieved significant succ" +
                            "ess on a global scale. Here's a brief description of Galantis"
                            ,
                    navController = navController,
                    drawableID = R.drawable.galantids.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.imaginedragons),
                    contentDescription = "",
                    place = "Russia",
                    eventTittle = "Imagine Dragons",
                    date = "01-12-23",
                    eventTime = "11:00 PM",
                    eventSubtittle = "Whatever it takes...",
                    eventDescription = "The band's music often explores themes of self-discove" +
                            "ry, empowerment, and resilience, and their lyrics resonate with a br" +
                            "songs has made them a favorite among fans of rock and pop music",
                    navController = navController,
                    drawableID = R.drawable.imaginedragons.toString()
                )

                concertCard(
                    painter = painterResource(id = R.drawable.acdc),
                    contentDescription = "",
                    place = "Allianz Arena",
                    eventTittle = "ACDC",
                    date = "10-10-24",
                    eventTime = "3:00 PM",
                    eventSubtittle = "Hell belling NOW",
                    eventDescription = "Formed in Sydney, Australia, in 1973, AC DC is " +
                            "one of the most iconic and enduring rock bands in the history" +
                            " of music. The band's name, AC DC is often interpreted as " +
                            "referring to Alternating Current Direct Current, which captures " +
                            "their high-energy and electrifying sound..",
                    navController = navController,
                    drawableID = R.drawable.acdc.toString()
                )

            }

        }
        MyTab(navController)
    }
}





