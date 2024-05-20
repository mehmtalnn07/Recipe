package com.mehmetalan.recipe.model

import androidx.annotation.DrawableRes


data class Category(
    val categoryId: Int,
    @DrawableRes val categoryImage: Int,
    val categoryName: String,
)
