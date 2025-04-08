package com.example.newsapp.utils

sealed class DataState<T> {

    data class Loading<T>(val isLoading: Boolean) : DataState<T>()

    data class Success<T>(val data: T) : DataState<T>()

    data class Response<T>(val uiComponent: UIComponent, val error: Exception?=null) : DataState<T>()
}