package com.example.newsapp.presentation.splash

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.domain.usecases.app_entry.AppEntryUseCases
import com.example.newsapp.utils.Screen
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


// this viewModel to check is app start from homeScreen or splashScreen
@HiltViewModel
class SplashViewModel @Inject constructor(
    appEntryUseCases: AppEntryUseCases,
) : ViewModel() {
    var startDestination = mutableStateOf(Screen.SplashScreen.route)
        private set

    init {
        appEntryUseCases.readAppEntry().onEach { shouldStartFromHomeScreen ->
            if (shouldStartFromHomeScreen) {
                startDestination.value = Screen.NewsNavigation.route
            } else {
                startDestination.value = Screen.StepperScreen.route
            }
        }.launchIn(viewModelScope)
    }

}