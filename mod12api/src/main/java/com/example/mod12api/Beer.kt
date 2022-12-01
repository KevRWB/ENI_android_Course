package com.example.mod12api

import com.squareup.moshi.Json

data class Beer(
    val name : String,
    val tagline : String,
    val desctiption : String,
    @Json(name = "image_url")
    val imageUrl : String,
    val abv : Double,


)
