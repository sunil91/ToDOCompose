package com.example.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todocompose.utils.Constant.LIST_ARGUMENTS_KEY
import com.example.todocompose.utils.Constant.LIST_SCREEN

fun NavGraphBuilder.listComposable(navigateToTaskScreen: (taskId: Int) -> Unit) {

    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENTS_KEY) { type = NavType.StringType })
    ) {

    }
}