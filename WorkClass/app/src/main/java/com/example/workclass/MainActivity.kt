package com.example.workclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.workclass.ui.theme.WorkClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            WorkClassTheme {
                Row(){
                    Column() {
                        Text(text = "Hello Word!")
                        Text(text = "Welcome to your first application")
                    }
                    Column() {
                        Text(text = "Hello Word!")
                        Text(text = "Welcome to your first application")

                    }
                    Column(){
                        Text(text = "Hello Word!")
                        Text(text = "Welcome to your first application")
                    }
                    Column(){
                        Text(text = "Hello Word")
                        Text(text = "the frist application")
                    }
                }
            }
        }
    }
}

