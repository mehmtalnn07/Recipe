package com.mehmetalan.recipe.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.Timelapse
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.data.FoodCategoryDataSource
import com.mehmetalan.recipe.model.FoodCategory
import com.mehmetalan.recipe.ui.theme.RecipeTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FoodsScreen(
    navController: NavHostController
) {
    Scaffold (
        topBar = { 
            CenterAlignedTopAppBar(
                title = { 
                    Text(
                        text = "Yemekler",
                        fontWeight = FontWeight.ExtraBold
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.ArrowBackIosNew,
                            contentDescription = "Back Button"
                        )
                    }
                }
            )
        }
    ) {innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            FoodList(
                foodList = FoodCategoryDataSource.foodList,
                navController = navController
            )
        }
    }
}

@Composable
fun FoodList(
    foodList: List<FoodCategory>,
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    LazyColumn {
        items(foodList) { food ->
            FoodCard(
                onFoodCardClick = {
                      navController.navigate("foodDetails/${food.foodId}")
                },
                food = food
            )
        }
    }
}

@Composable
fun FoodCard(
    onFoodCardClick: () -> Unit,
    food: FoodCategory,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onFoodCardClick)
            .height(220.dp)
            .padding(bottom = 5.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(
            painter = painterResource(id = food.foodImage),
            contentDescription = food.foodName,
            contentScale = ContentScale.Crop
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = food.foodName,
                color = MaterialTheme.colorScheme.background,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp
            )
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp),
            ) {
                Icon(
                    imageVector = Icons.Outlined.Timelapse,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.background
                )
                Text(
                    text = food.makingTime,
                    color = MaterialTheme.colorScheme.background,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun FoodCardPreview() {
    RecipeTheme {
        FoodCard(
            onFoodCardClick = {  },
            food = FoodCategory(
                foodId = 1,
                foodImage = R.drawable.karni_yarik,
                foodName = "Karnı Yarık",
                makingTime = "10 dk.",
                recipe = "",
                materials = ""
            )
        )
    }
}