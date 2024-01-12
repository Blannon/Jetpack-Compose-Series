package com.blannon_network.composeseries.basics.buttons_and_box

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.blannon_network.composeseries.R

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "id:pixel_7_pro",
    name = "Buttons"
)
@Composable
 fun Buttons(){
     Column(
         modifier =Modifier
             .fillMaxSize()
             .fillMaxWidth()
             .background(Color.Black),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
     ) {

         Button(onClick = {}) {
             Text(
                 text ="Get Started"
             )
             
         }
         Button(onClick = {}) {
             Text(
                 text ="Cancel",
                 color = Color.Magenta
             )
             Text(
                 text =" Action")

         }

         Button(
             onClick = {},
             colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
             Text(
                 text ="SignUp"
             )

         }

         Button(onClick = {}) {

             Image(
                 painter = painterResource(id = R.drawable.ic_android_black_24dp),
                 contentDescription =null )
             Text(
                 text =" Android"
             )

         }

         Button(
             onClick = {},
             border = BorderStroke(
                 1.dp,
                 color= Color.Blue),
             colors = ButtonDefaults.outlinedButtonColors(
                 contentColor =  Color.Magenta
             )
         ) {
             Text(
                 text ="Login"
             )

         }

         Button(
             onClick = {},
             shape = RoundedCornerShape(15.dp)
         ) {
             Text(
                 text ="I love Round Things"
             )

         }
     }
 }