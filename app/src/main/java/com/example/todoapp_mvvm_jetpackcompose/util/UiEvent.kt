package com.example.todoapp_mvvm_jetpackcompose.util

sealed class UiEvent{
    object PopBackStack: UiEvent()
    data class Navigate(val route:String): UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null
    ):UiEvent()
}
