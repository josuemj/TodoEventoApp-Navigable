import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.uielements.tabTEst

@Preview
@Composable
fun Favorites(){

    Column {
        topBar(varTittle = "Your favorites <3")

        Column(
            Modifier
                .fillMaxSize()
                .weight(1f)) {

        }

        tabTEst()

    }


}