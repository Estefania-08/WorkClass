package com.example.workclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workclass.ui.theme.WorkClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            WorkClassTheme {
                Column() {
                    Column() {
                        TextComposable("Roberto")
                        TextComposable()
                    }
                    Row() {
                        TextComposable()
                        TextComposable()

                    }
                    Column() {
                        Text(text = "Hello Word!")
                        Text(text = "Welcome to your first application")
                    }
                    Column {
                        ModifierExample2()

                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun TextComposable(name: String = "Empty") {
        Text("Helow World")
        Text(name)
    }

    @Preview(showBackground = true)
    @Composable
    fun Modifierexample1(name: String = "Empty") {
        Column(
            modifier = Modifier
                .padding(24.dp, 10.dp, 20.dp, 10.dp)
        ) {
            Text("Hellow World")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample2() {
        Column(
            modifier = Modifier
                .padding(24.dp, 10.dp, 20.dp, 10.dp)
                .fillMaxWidth()
                .clickable(onClick = { clickAction() })
        ) {
            Text("Hellow World")

        }
    }
    fun clickAction(){
        println("Column Clicked")
    }
}



