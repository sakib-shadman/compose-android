package com.example.compose.core.domain

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class UseCase<PARAM, RESULT>(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {
    suspend operator fun invoke(param: PARAM): RESULT {
        return withContext(dispatcher) { execute(param) }
    }

    protected abstract suspend fun execute(p: PARAM): RESULT
}