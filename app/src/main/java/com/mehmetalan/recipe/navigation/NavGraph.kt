package com.mehmetalan.recipe.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mehmetalan.recipe.screens.DessertDetails
import com.mehmetalan.recipe.screens.DessertsScreen
import com.mehmetalan.recipe.screens.FoodDetails
import com.mehmetalan.recipe.screens.FoodsScreen
import com.mehmetalan.recipe.screens.HomeScreen
import com.mehmetalan.recipe.screens.SaladDetails
import com.mehmetalan.recipe.screens.SaladsScreen
import com.mehmetalan.recipe.screens.SoupDetails
import com.mehmetalan.recipe.screens.SoupsScreen
import com.mehmetalan.recipe.screens.SplashScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable(route = "splash") {
            SplashScreen(
                navController = navController
            )
        }
        composable(route = "home") {
            HomeScreen(
                navController = navController
            )
        }
        composable(route = "foods") {
            FoodsScreen(
                navController = navController
            )
        }
        composable(route = "desserts") {
            DessertsScreen(
                navController = navController
            )
        }
        composable(route = "salads") {
            SaladsScreen(
                navController = navController
            )
        }
        composable(route = "soups") {
            SoupsScreen(
                navController = navController
            )
        }
        composable(route = "foodDetails/{foodId}") {backstackEntry ->
            val foodId = backstackEntry.arguments?.getString("foodId")?.toInt() ?: 0
            FoodDetails(
                navController = navController,
                foodId = foodId
            )
        }
        composable(route = "dessertDetails/{dessertId}") {backStackEntry ->
            val dessertId = backStackEntry.arguments?.getString("dessertId")?.toInt() ?: 0
            DessertDetails(
                navController = navController,
                dessertId = dessertId
            )
        }
        composable(route = "saladDetails/{saladId}") { backStackEntry ->
            val saladId = backStackEntry.arguments?.getString("saladId")?.toInt() ?: 0
            SaladDetails(
                navController = navController,
                saladId = saladId
            )
        }
        composable(route = "soupDetails/{soupId}") {backStackEntry ->
            val soupId = backStackEntry.arguments?.getString("soupId")?.toInt() ?: 0
            SoupDetails(
                navController = navController,
                soupId = soupId
            )
        }
    }
}