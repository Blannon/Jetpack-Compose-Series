package com.blannon_network.composeseries.basics.row_and_column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    showBackground = true,
    device = "id:pixel_7_pro",
    showSystemUi = true,
    name = "Row Display")
@Composable
fun PreRow(){

    Row (
        modifier = Modifier
            .padding(top =30.dp)

    ){
        Text(
            text ="Box 1",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(20.dp)
        )
        Text(
            text ="Box 2",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(20.dp)
        )
        Text(
            text ="Box 3",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(20.dp)
        )
        Text(
            text ="Box 4",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(20.dp)
        )
        Text(
            text ="Box 5",
            fontSize = 15.sp,
            modifier = Modifier
                .padding(20.dp)
        )
    }
}