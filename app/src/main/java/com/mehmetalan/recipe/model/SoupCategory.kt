package com.mehmetalan.recipe.model

import androidx.annotation.DrawableRes

data class SoupCategory(
    val soupId: Int,
    @DrawableRes val soupImage: Int,
    val soupName: String,
    val makingTime: String,
    val recipe: String,
    val materials: String
)
