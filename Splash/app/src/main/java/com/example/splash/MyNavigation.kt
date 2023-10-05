package com.example.splash

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MyNavigation(navController: NavController) {
    NavHost(navController = navController as NavHostController, startDestination = Destinations.SplashScreen.route){
        composable(Destinations.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(Destinations.HomeScreen.route){
            HomeScreen()
        }
    }
}