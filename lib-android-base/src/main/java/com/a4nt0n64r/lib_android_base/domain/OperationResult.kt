package com.a4nt0n64r.lib_android_base.domain

import java.io.IOException

sealed class OperationResult<out T> {
    class ResultSuccess<T>(val result: T) : OperationResult<T>()
    class ResultError(val error: String?) : OperationResult<Nothing>()
    object ResultNetworkError : OperationResult<Nothing>()

    companion object {
        fun <T>mapThrowableToResult(e: Throwable): OperationResult<T> {
            return if (e.cause is IOException || e is IOException) ResultNetworkError
            else ResultError(null)
        }
    }
}