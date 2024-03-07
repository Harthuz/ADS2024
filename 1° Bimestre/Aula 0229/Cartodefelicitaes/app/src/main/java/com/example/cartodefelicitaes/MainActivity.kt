package com.example.cartodefelicitaes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartodefelicitaes.ui.theme.CartãoDeFelicitaçõesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeFelicitaçõesTheme {
                // A surface container using the 'background' color from the theme
                @Composable
                fun Greeting(name: String, modifier: Modifier = Modifier) {
                    Text(
                        text = "Hi, my name is $name!",
                        modifier = modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Blue) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(7.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CartãoDeFelicitaçõesTheme {
        Greeting("Hernandes")
    }
}