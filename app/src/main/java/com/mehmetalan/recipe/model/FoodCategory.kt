package com.mehmetalan.recipe.model

import androidx.annotation.DrawableRes

data class FoodCategory(
    val foodId: Int,
    @DrawableRes val foodImage: Int,
    val foodName: String,
    val makingTime: String,
    val recipe: String,
    val materials: String
)
