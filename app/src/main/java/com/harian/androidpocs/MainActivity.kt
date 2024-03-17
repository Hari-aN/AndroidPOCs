package com.harian.androidpocs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.harian.androidpocs.ui.theme.AndroidPOCsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidPOCsTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Button(
                            onClick = { /* Do something */ },
                            modifier = Modifier
                                .size(150.dp)
                                .weight(1f)
                        ) {
                            Text("Button 1")
                        }
                        Button(
                            onClick = { /* Do something */ },
                            modifier = Modifier
                                .size(150.dp)
                                .weight(1f)
                        ) {
                            Text("Button 2")
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Button(
                            onClick = { /* Do something */ },
                            modifier = Modifier
                                .size(150.dp)
                                .weight(1f)
                        ) {
                            Text("Button 3")
                        }
                        Button(
                            onClick = { /* Do something */ },
                            modifier = Modifier
                                .size(150.dp)
                                .weight(1f)
                        ) {
                            Text("Button 4")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidPOCsTheme {
        Greeting("Android")
    }
}