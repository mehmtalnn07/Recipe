package com.mehmetalan.recipe.data

import com.mehmetalan.recipe.R
import com.mehmetalan.recipe.model.Category

object CategoryDataSource {

    val categoryList = listOf(
        Category(
            categoryId = 1,
            categoryImage = R.drawable.food_background,
            categoryName = "Yemekler"
        ),
        Category(
            categoryId = 2,
            categoryImage = R.drawable.dessert_background,
            categoryName = "Tatlılar"
        ),
        Category(
            categoryId = 3,
            categoryImage = R.drawable.salad_background,
            categoryName = "Salatalar"
        ),
        Category(
            categoryId = 4,
            categoryImage = R.drawable.soup_background,
            categoryName = "Çorbalar"
        )
    )

}