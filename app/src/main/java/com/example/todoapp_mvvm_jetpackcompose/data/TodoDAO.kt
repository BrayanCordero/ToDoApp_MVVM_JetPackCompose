package com.example.todoapp_mvvm_jetpackcompose.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import java.net.IDN


//DAO: Data Access Object, defines how we want to access the data.
@Dao
interface TodoDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id")
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM todo")
    fun getTodos(): Flow<List<Todo>>

}