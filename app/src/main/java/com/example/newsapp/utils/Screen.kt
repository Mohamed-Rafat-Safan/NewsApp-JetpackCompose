package com.example.newsapp.utils

sealed class Screen(
    val route: String,
) {
    object SplashScreen : Screen(route = "splashScreen")
    object StepperScreen : Screen(route = "stepperScreen")
    object HomeScreen : Screen(route = "homeScreen")
    object SearchScreen : Screen(route = "searchScreen")
    object BookmarkScreen : Screen(route = "bookmarkScreen")
    object DetailsScreen : Screen(route = "detailsScreen")
    object AppStartNavigation : Screen(route = "appStartNavigation")
    object NewsNavigation : Screen(route = "newsNavigation")
    object NewsNavigatorScreen : Screen(route = "newsNavigator")
}