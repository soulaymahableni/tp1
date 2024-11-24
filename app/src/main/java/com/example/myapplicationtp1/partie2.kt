package com.example.myapplicationtp1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Partie2() {
    Column(modifier = Modifier.fillMaxSize()) {

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(300.dp)
                    .background(Color.Blue)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(300.dp)
                    .background(Color.Green)
            )
        }


        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(300.dp)
                    .background(Color.Red)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(300.dp)
                    .background(Color.Yellow)
            )
        }
    } }
    @Preview(showBackground = true)
    @Composable
    fun PreviewPartie2() {
        Partie2()
    }



