package com.example.todocompose.data.repository

import com.example.todocompose.data.model.ToDoDao
import com.example.todocompose.data.model.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTask: Flow<List<ToDoTask>> = toDoDao.getAllTask()

    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()

    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()


    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(task: ToDoTask) {
        toDoDao.addTask(toDoTask = task)
    }

    suspend fun updateTask(task: ToDoTask) {
        toDoDao.updateTask(toDoTask = task)
    }

    suspend fun deleteTask(task: ToDoTask) {
        toDoDao.deleteTask(toDoTask = task)
    }

    suspend fun deleteAllTask() {
        toDoDao.deleteAllTask()
    }

    fun serachDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(searchQuery)
    }


}