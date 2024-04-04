package com.example.layoutcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutcomposable.ui.theme.LayoutComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            Column {
//                Text(
//                    text = "Hello", color = Color.White,
//                    fontSize = 24.sp, modifier = Modifier
//                        .background(Color.Blue)
//                        .clickable { }
//                        .size(200.dp)
//                        .padding(36.dp)
//                        .border(4.dp, Color.Red)
//                        .clip(CircleShape)
//                        .background(Color.Yellow)
//                        .fillMaxSize()
//
//                )
//
//            }
//            CircularImage()


            PreviewCategory()
        }

    }
}


@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {

}

@Composable
fun CircularImage() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(
                4.dp, color = Color.LightGray,
                CircleShape
            ))
}