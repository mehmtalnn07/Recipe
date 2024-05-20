package com.mehmetalan.recipe.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.data.CategoryDataSource
import com.mehmetalan.recipe.model.Category
import com.mehmetalan.recipe.ui.theme.RecipeTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Tarifler",
                        fontWeight = FontWeight.ExtraBold
                    )
                }
            )
        }
    ) {innerPadding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            CategoryList(
                categoryList = CategoryDataSource.categoryList,
                navController = navController
            )
        }
    }
}

@Composable
fun CategoryList(
    navController: NavHostController,
    categoryList: List<Category>,
) {
    LazyColumn {
        items(categoryList) { category ->
            CategoryCard(
                category = category,
                onCategoryClick = {categoryId ->
                    when(categoryId) {
                        1 -> navController.navigate(route = "foods")
                        2 -> navController.navigate(route = "desserts")
                        3 -> navController.navigate(route = "salads")
                        4 -> navController.navigate(route = "soups")
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun CategoryListPreview() {
    RecipeTheme {
        CategoryList(
            categoryList = CategoryDataSource.categoryList,
            navController = rememberNavController()
        )
    }
}

@Composable
fun CategoryCard(
    onCategoryClick: (Int) -> Unit,
    category: Category,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { onCategoryClick(category.categoryId) }),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = category.categoryImage),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )
        Text(
            text = category.categoryName,
            color = MaterialTheme.colorScheme.onPrimary,
            fontSize = 50.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace
        )
    }
}

@Preview
@Composable
fun CategoryCardPreview() {
    RecipeTheme {
        CategoryCard(
            category = Category(
                categoryId = 1,
                categoryImage = R.drawable.food_background,
                categoryName = "Foods",
            ),
            onCategoryClick = {  }
        )
    }
}