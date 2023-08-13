package com.example.compose.udemy.data.repository

import com.example.compose.core.domain.Result
import com.example.compose.udemy.domain.entity.Product

internal interface ProductRepository {
    suspend fun fetchProducts(): Result<List<Product>>
}