package com.example.compose.udemy.domain.repository

import com.example.compose.core.domain.Result
import com.example.compose.udemy.data.remote.product.ProductApiService
import com.example.compose.udemy.data.repository.ProductRepository
import com.example.compose.udemy.domain.entity.Product
import javax.inject.Inject

internal class ProductRepositoryImpl @Inject constructor(
    private val productApiService: ProductApiService
) : ProductRepository {
    override suspend fun fetchProducts(): Result<List<Product>> {
        return try {
            val response = productApiService.fetchProduct()

            val products = response.map {
                Product(
                    id = it.id.toString(),
                    title = it.title,
                    price = it.price,
                )
            }
            Result.Success(products)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

}