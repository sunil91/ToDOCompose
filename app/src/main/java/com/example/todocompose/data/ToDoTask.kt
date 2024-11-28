package com.example.todocompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todocompose.data.model.Priority
import com.example.todocompose.utils.Constant.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority,
)


