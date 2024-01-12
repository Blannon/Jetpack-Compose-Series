package com.blannon_network.composeseries.basics.row_and_column

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true,
    device = "id:pixel_7_pro",
    showSystemUi = true,
    name = "Row and Column")

@Composable
fun MainDisplay1(){

    PreRow()
    PreColumn()
}