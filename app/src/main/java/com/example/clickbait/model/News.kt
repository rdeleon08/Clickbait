package com.example.clickbait.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class News(
    @DrawableRes val image: Int,
    @StringRes val headline: Int,
    val companyName: String,
    val lastUpdated: String,
)
