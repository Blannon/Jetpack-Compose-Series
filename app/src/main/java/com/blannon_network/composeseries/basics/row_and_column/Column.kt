package com.blannon_network.composeseries.basics.row_and_column

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(
    showBackground = true,
    device = "id:pixel_7_pro",
    showSystemUi = true,
    name = "Column Display")

@Composable
fun PreColumn() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = " Box 1",
            fontSize = 20.sp,
            modifier = Modifier
                .padding()

        )
        Text(
            text = " Box 1",
            fontSize = 20.sp,
            modifier = Modifier
                .padding()
        )

        Text(
            text = " Box 1",
            fontSize = 20.sp,
            modifier = Modifier
                .padding()
        )


    }
}