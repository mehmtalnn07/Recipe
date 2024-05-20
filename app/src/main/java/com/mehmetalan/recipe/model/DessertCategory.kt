package com.mehmetalan.recipe.model

import androidx.annotation.DrawableRes

data class DessertCategory(
    val dessertId: Int,
    @DrawableRes val dessertImage: Int,
    val dessertName: String,
    val makingTime: String,
    val recipe: String,
    val materials: String
)
