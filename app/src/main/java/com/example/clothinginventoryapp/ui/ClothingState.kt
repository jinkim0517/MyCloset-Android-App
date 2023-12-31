package com.example.clothinginventoryapp.ui

import android.net.Uri
import com.example.clothinginventoryapp.model.Clothing
import com.example.clothinginventoryapp.model.ClothingCategory
import com.example.clothinginventoryapp.persistence.SortType

data class ClothingState(
    val clothes: List<Clothing> = emptyList(),
    val name: String = "",
    val price: Double = 0.0,
    val size: String = "",
    val category: ClothingCategory = ClothingCategory.ACCESSORY,
    val image: String = "",
    val currentSortType: SortType = SortType.NAME
)
