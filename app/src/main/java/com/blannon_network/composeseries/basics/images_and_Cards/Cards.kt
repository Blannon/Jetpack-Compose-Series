package com.blannon_network.composeseries.basics.images_and_Cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blannon_network.composeseries.R

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "id:pixel_7_pro",
    name = "Buttons",
)
@Composable
fun DemoCards(){

    Column {
        Card (
            modifier = Modifier
                .padding(15.dp),
            shape = RoundedCornerShape(size =  10.dp),
        ){

            Row (
                modifier = Modifier
                    .padding(all= 5.dp)
            ){
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(100.dp),
                    painter = painterResource(id = R.drawable.bmwx6) ,
                    contentDescription =null,
                    contentScale = ContentScale.Crop
                )

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                Text(
                    text = "BMW X6",
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp)
            }
        }

        Card (
            modifier = Modifier
                .padding(15.dp)
        ){
            Row (
                modifier = Modifier.width(300.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .size(100.dp),
                    painter = painterResource(id =R.drawable.benz),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )

                Text(
                    text ="Wagon",
                    modifier =Modifier
                        .padding(horizontal = 15.dp),
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }


        Card(
            modifier =Modifier
                .padding(15.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(15.dp)
                    .width(100.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bmwx6),
                    contentDescription =null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(88.dp)
                        .clip(CircleShape)
                )

                Text(
                    modifier = Modifier
                        .paddingFromBaseline(
                            top = 24.dp,
                            bottom = 8.dp
                        ),
                    text = "BMW X6",
                    fontWeight = FontWeight.Medium
                )

            }

        }
    }

}


