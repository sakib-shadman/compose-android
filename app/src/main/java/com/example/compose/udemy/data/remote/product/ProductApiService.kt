package com.example.compose.udemy.data.remote.product

import retrofit2.http.GET

internal interface ProductApiService {
    @GET("products")
    suspend fun fetchProduct(): ProductListResponse
}