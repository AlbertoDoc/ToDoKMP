package org.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.example.project.pages.Home

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Home.routeName) {
        composable(route = Routes.Home.routeName) {
            Home()
        }

        composable(Routes.Register.routeName) {

        }
    }
}