package com.mehmetalan.recipe.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mehmetalan.recipe.data.FoodCategoryDataSource.foodList
import com.mehmetalan.recipe.data.SoupCategoryDataSource
import com.mehmetalan.recipe.model.FoodCategory
import com.mehmetalan.recipe.model.SoupCategory

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SoupsScreen(
    navController: NavHostController
) {
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Çorbalar",
                        fontWeight = FontWeight.ExtraBold
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = { navController.popBackStack() }
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
            SoupList(
                soupList = SoupCategoryDataSource.soupList,
                navController = navController
            )
        }
    }
}

@Composable
fun SoupList(
    soupList: List<SoupCategory>,
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    LazyColumn {
        items(soupList) { soup ->
            SoupCard(
                onSoupCardClick = {
                    navController.navigate("soupDetails/${soup.soupId}")
                },
                soup = soup
            )
        }
    }
}

@Composable
fun SoupCard(
    onSoupCardClick: () -> Unit,
    soup: SoupCategory,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onSoupCardClick)
            .height(220.dp)
            .padding(bottom = 5.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(
            painter = painterResource(id = soup.soupImage),
            contentDescription = soup.soupName,
            contentScale = ContentScale.Crop
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = soup.soupName,
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
                    text = soup.makingTime,
                    color = MaterialTheme.colorScheme.background,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
            }
        }
    }
}