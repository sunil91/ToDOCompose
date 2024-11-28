package com.example.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todocompose.navigation.destinations.listComposable
import com.example.todocompose.navigation.destinations.taskComposable
import com.example.todocompose.utils.Constant.LIST_SCREEN

@Composable
fun SetUpNavigation(navHostController: NavHostController) {
    val screen = remember(navHostController) {
        Screens(navController = navHostController)
    }
    NavHost(navController = navHostController, startDestination = LIST_SCREEN){
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)

    }
}