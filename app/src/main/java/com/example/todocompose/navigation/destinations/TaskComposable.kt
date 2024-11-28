package com.example.todocompose.navigation.destinations


import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todocompose.utils.Action
import com.example.todocompose.utils.Constant.LIST_ARGUMENTS_KEY
import com.example.todocompose.utils.Constant.TASK_ARGUMENTS_KEY
import com.example.todocompose.utils.Constant.TASK_SCREEN

fun NavGraphBuilder.taskComposable(navigateToListScreen: (action: Action) -> Unit) {

    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENTS_KEY) { type = NavType.IntType })) {

    }
}