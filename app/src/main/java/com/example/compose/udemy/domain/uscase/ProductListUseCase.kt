package com.example.compose.udemy.domain.uscase

import com.example.compose.udemy.data.repository.ProductRepository
import javax.inject.Inject

internal class ProductListUseCase @Inject constructor(
    private val productRepository: ProductRepository,
)  {

}