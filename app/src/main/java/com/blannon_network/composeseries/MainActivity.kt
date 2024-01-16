package com.blannon_network.composeseries

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.blannon_network.composeseries.LazyColumn.carzone.dataclasses.ChildClass
//import com.blannon_network.composeseries.LazyColumn.carzone.dataclasses.ParentClass

//class MainActivity : ComponentActivity() {
//
//    private val parentItemList = ArrayList<ParentClass>()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            setData()
//            MainApp(
//                modifier = Modifier,
//                parentItemList
//            )
//        }
//    }
//
//    private fun setData() {
//        val images = listOf(
//            ChildClass("BMW",R.drawable.bmw1),
//            ChildClass("BMW",R.drawable.bmw2),
//            ChildClass("BMW",R.drawable.bmw3),
//            ChildClass("BMW",R.drawable.bmw4),
//            ChildClass("BMW",R.drawable.bmw5),
//            ChildClass("BMW",R.drawable.bmw6),
//            ChildClass("Benz",R.drawable.benz1),
//            ChildClass("Benz",R.drawable.benz2),
//            ChildClass("Benz",R.drawable.benz3),
//            ChildClass("Benz",R.drawable.benz4),
//            ChildClass("Benz",R.drawable.benz5),
//            ChildClass("Benz",R.drawable.benz6),
//            ChildClass("Audi",R.drawable.audi1),
//            ChildClass("Audi",R.drawable.audi2),
//            ChildClass("Audi",R.drawable.audi3),
//            ChildClass("Audi",R.drawable.audi4),
//            ChildClass("Audi",R.drawable.audi5),
//            ChildClass("Audi",R.drawable.audi6),
//            ChildClass("Ford",R.drawable.ford1),
//            ChildClass("Ford",R.drawable.ford2),
//            ChildClass("Ford",R.drawable.ford3),
//            ChildClass("Ford",R.drawable.ford4),
//            ChildClass("Ford",R.drawable.ford5),
//            ChildClass("Toyota",R.drawable.toyota1),
//            ChildClass("Toyota",R.drawable.toyota2),
//            ChildClass("Toyota",R.drawable.toyota3),
//            ChildClass("Toyota",R.drawable.toyota4),
//            ChildClass("Toyota",R.drawable.toyota5),
//            ChildClass("Toyota",R.drawable.toyota6),
//            ChildClass("Mazda",R.drawable.mazida1),
//            ChildClass("Mazda",R.drawable.mazda2),
//            ChildClass("Mazda",R.drawable.mazda3),
//            ChildClass("Mazda",R.drawable.mazda4),
//            ChildClass("Mazda",R.drawable.mazda5),
//            ChildClass("Mazda",R.drawable.mazda6),
//        )
//
//        val carTypes = listOf("BMW", "Benz", "Audi", "Ford", "Toyota", "Mazda")
//
//        for (carType in carTypes) {
//            val carImages = images.filter { it.carType.equals(carType, ignoreCase = true) }
//            parentItemList.add(ParentClass("$carType:", carImages))
//        }
//    }
//
//}
//@Composable
//fun MainApp(modifier: Modifier, parentItemList: ArrayList<ParentClass>) {
//    LazyColumn(
//        contentPadding = PaddingValues(16.dp)
//    ){
//        items(parentItemList.size){
//            ColumnUI(
//                modifier = modifier,
//                parentList = parentItemList,
//                itemIndex = it
//            )
//        }
//    }
//}
//@Composable
//fun ColumnUI(
//    modifier: Modifier = Modifier,
//    itemIndex: Int,
//    parentList: ArrayList<ParentClass>,
//
//    ){
//    Card (
//        modifier
//            .padding(10.dp),
//        elevation = CardDefaults.cardElevation(8.dp),
//        colors = CardDefaults.cardColors(
//            containerColor = Color.LightGray
//        )
//    ){
//        Text(
//            text = parentList[itemIndex].title,
//            modifier.padding(10.dp),
//            fontSize = 25.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Magenta
//        )
//        LazyRow(
//            modifier.padding(paddingValues = PaddingValues(10.dp))
//        ){
//            items(parentList[itemIndex].images.size){
//                RowUI(
//                    modifier = modifier,
//                    childList = parentList[itemIndex].images,
//                    itemIndex = it
//                )
//
//            }
//        }
//    }
//}
//
//@Composable
//fun RowUI(modifier: Modifier, childList: List<ChildClass>, itemIndex: Int) {
//    Box(
//        modifier
//            .height(200.dp)
//            .width(170.dp)
//            .padding(horizontal = 12.dp)
//            .clip(RoundedCornerShape(10.dp))
//            .background(Color.DarkGray))
//    {
//        Image(
//            painter = painterResource(id = childList[itemIndex].drawableResId),
//            contentDescription = null,
//            modifier
//                .fillMaxSize())
//    }
//}
//
//
//
//
