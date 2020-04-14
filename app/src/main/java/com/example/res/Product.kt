package com.example.res

import androidx.annotation.DrawableRes

data class Product (
    val id: Int,
    val title: String,
    val price: String,

    @DrawableRes
    val image: Int

)