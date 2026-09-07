package com.example.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            hello()
        }
    }
}

@Composable
fun hello() {
    Row(modifier = Modifier.padding(horizontal = 5.dp, vertical = 50.dp)) {
        Image(
            painter = painterResource(id = R.drawable.fotodafa),
            contentDescription = "Foto Dafa",
            modifier = Modifier.size(150.dp)
        )

        Column(modifier = Modifier.padding(horizontal = 10.dp)) {
            Text(text = "Dafa Luthfan Otter")
            Text(text = "245150407111068")


        }
    }
}

@Preview
@Composable
fun helloPrev() {
    hello()
}
