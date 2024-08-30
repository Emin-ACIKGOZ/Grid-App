package com.example.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameId: Int,
    val availableCourses: Int,
    @DrawableRes val imageId: Int,
)
