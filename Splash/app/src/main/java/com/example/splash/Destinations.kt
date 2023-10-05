package com.example.splash

sealed class Destinations(val route: String){
    object HomeScreen: Destinations("home")
    object SplashScreen: Destinations("splash_screen")
}
