package com.example.todocompose.navigation

import androidx.navigation.NavHostController
import com.example.todocompose.utils.Action
import com.example.todocompose.utils.Constant.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {

            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId") {
            // popUpTo(TASK_SCREEN){inclusive=true}
        }
    }
}