package com.example.firstcomposeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeapp.ui.theme.FirstComposeappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /* setContent {
            Log.wtf("Ashish","second")
          //  Greeting("Everyone")
            NewsStory()
//            ClickCounter(clicks = 2) {
//
//            }
        }*/



    }
}

/*
@Composable
fun ClickCounter(clicks: Int, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("I've been clicked $clicks times")
    }
}
*/
/*
@Composable
fun Greeting(name:String){
    Log.wtf("Ashish","first")
    Text(text = "Hello $name!")
}

@Preview
@Composable
fun PreviewGreeting(){
    Log.wtf("Ashish","third")
    Greeting("Android")
}*/



@Composable
fun NewsStory() {
    Log.wtf("Ashish","first")
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            "A day wandering through the sandhills " +
                    "in Shark Fin Cove, and a few of the " +
                    "sights I saw",
            style = typography.h6,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis)
        Text("Davenport, California",
            style = typography.body1)
        Text("December 2018",
            style = typography.body2)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Log.wtf("Ashish","third")
    NewsStory()
}


