import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.favorites.Favorites_class
import com.example.myapplication.ui.uielements.favoriteCard
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import com.example.myapplication.ui.uielements.MyTab

data class Concert(var drawableId:String, var eventTittle:String,var eventDescription: String)


@Composable
fun Favorites(navController: NavController){


    Column {
        topBar(varTittle = "Your favorites <3")

        LazyColumn(
            Modifier
                .fillMaxSize()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            items(items = Favorites_class.favoritesList){
                    favCard -> favoriteCard(favCard)
            }
        }

        MyTab(navController = navController)

    }


}