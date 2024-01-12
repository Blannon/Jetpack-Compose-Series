package com.blannon_network.composeseries.basics.buttons_and_box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showSystemUi = true,
    showBackground = true,
    name = "Box Display",
    device = "id:pixel_7_pro"
)

@Composable
fun SampleBox(){

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ){

        Box(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp)
                .background(Color.White)
        )

        Box(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp)
                .background(Color.Magenta)
                .align(Alignment.TopEnd)
        )

        Box(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp)
                .background(Color.Gray)
                .align(Alignment.CenterStart)
        )

        Box(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp)
                .background(Color.DarkGray)
                .align(Alignment.CenterEnd)
        )

        Box(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp)
                .background(Color.Green)
                .align(Alignment.BottomEnd)
        )

        Box(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp)
                .background(Color.Red)
                .align(Alignment.BottomStart)

        )
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Blue)
                .align(Alignment.Center)
        )

        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Magenta)
                .align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .align(Alignment.BottomCenter)
        )


    }
}