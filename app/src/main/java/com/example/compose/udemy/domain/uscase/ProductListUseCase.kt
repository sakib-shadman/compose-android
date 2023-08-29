package com.example.compose.udemy.domain.uscase

import com.example.compose.core.di.AppDispatchers
import com.example.compose.core.di.Dispatcher
import com.example.compose.core.domain.Result
import com.example.compose.core.domain.UseCase
import com.example.compose.udemy.data.repository.ProductRepository
import com.example.compose.udemy.domain.entity.Product
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

internal class ProductListUseCase @Inject constructor(
    private val productRepository: ProductRepository,
    @Dispatcher(AppDispatchers.IO) private val ioDispatchers: CoroutineDispatcher
) : UseCase<Unit, Result<List<Product>>>(ioDispatchers) {
    override suspend fun execute(p: Unit): Result<List<Product>> = productRepository.fetchProducts()
}