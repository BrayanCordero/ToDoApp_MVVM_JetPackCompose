package com.example.todoapp_mvvm_jetpackcompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Table in Room DB
@Entity
data class Todo(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val description: String?,
    val isDone: Boolean
)
