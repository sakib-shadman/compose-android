package com.example.compose.udemy.domain.entity

data class Product(
    val id: String,
    val title: String,
    val price: Double,
    val description: String = "",
    val imageUrl: String = ""
)
