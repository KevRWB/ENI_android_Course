package com.example.mod5tphistoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Story(
    val name: String,
    val color: String
) : Parcelable
