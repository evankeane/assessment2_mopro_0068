package com.example.tiketpertandingan.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tiketpertandingan.ui.theme.screen.MainScreen
import com.example.tiketpertandingan.ui.theme.screen.PertandinganScreen



@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            MainScreen(navController)
        }
        composable(route = Screen.Pertandingan.route){
            PertandinganScreen(navController)
        }
    }
    }

