package com.blannon_network.composeseries.basics.texts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(
    showBackground = true,
    device = "id:pixel_7_pro",
    showSystemUi = true,
    name = "First View"
)
@Composable
fun TextFun(){


    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color.LightGray)
    ){
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontSize = 30.sp,
                        color = Color.Magenta
                    )
                ){
                    append("Blannon")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 30.sp,
                        color = Color.Red
                    )
                )
                {
                    append("Network")
                }
            },
            modifier = Modifier
                .fillMaxSize(),
            style = TextStyle(
                color = Color.Red,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                letterSpacing = 12.sp,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            ),
        )
    }

}
