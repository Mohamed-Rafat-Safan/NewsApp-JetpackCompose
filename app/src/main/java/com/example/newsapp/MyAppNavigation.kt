package com.example.newsapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.presentation.news_navigator.NewsNavigator
import com.example.newsapp.presentation.splash.SplashScreen
import com.example.newsapp.presentation.stepper.StepperScreen
import com.example.newsapp.utils.Screen


@Composable
fun MyAppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.SplashScreen.route) {
        composable(route = Screen.SplashScreen.route) { SplashScreen(navController) }
        composable(route = Screen.StepperScreen.route) { StepperScreen(navController) }


        navigation(
            route = Screen.NewsNavigation.route,
            startDestination = Screen.NewsNavigatorScreen.route
        ) {
            composable(route = Screen.NewsNavigatorScreen.route) {
                NewsNavigator()
            }
        }
    }
}

