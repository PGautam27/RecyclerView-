package com.example.puppy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.puppy.composable.BarkHomeContent
import com.example.puppy.ui.theme.PUPPYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PUPPYTheme {
                // A surface container using the 'background' color from the theme
               MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
   Scaffold(content = {
       BarkHomeContent()
   })
}