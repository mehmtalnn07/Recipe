package com.mehmetalan.recipe.model

import androidx.annotation.DrawableRes

data class SaladCategory(
    val saladId: Int,
    @DrawableRes val saladImage: Int,
    val saladName: String,
    val makingTime: String,
    val recipe: String,
    val materials: String
)
