package com.hythes.composeapidemo.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hythes.composeapidemo.ui.dashboard.DashboardScreen
import com.hythes.composeapidemo.ui.post.PostScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =Screen.DashboardScreen.route){
        composable(Screen.DashboardScreen.route){ DashboardScreen(navController = navController)}
        composable(Screen.PostScreen.route){ PostScreen()}
    }
}


sealed class Screen(val route : String){
    object DashboardScreen : Screen("dashboard")
    object PostScreen : Screen("post")
}