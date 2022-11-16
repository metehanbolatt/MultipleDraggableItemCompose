package com.metehanbolat.multipledraggableitemcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.metehanbolat.multipledraggableitemcompose.ui.theme.MultipleDraggableItemComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleDraggableItemComposeTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    DraggableItem(name = "M", backgroundColor = Color.Red)
                    DraggableItem(name = "T", backgroundColor = Color.Blue)
                    DraggableItem(name = "S", backgroundColor = Color.Green)
                    DraggableItem(name = "K", backgroundColor = Color.Gray)
                    DraggableItem(name = "L", backgroundColor = Color.Cyan)
                }
            }
        }
    }
}
