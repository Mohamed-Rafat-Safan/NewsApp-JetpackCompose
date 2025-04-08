package com.example.newsapp.presentation.stepper

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.domain.usecases.app_entry.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StepperViewModel @Inject constructor(
    private val appEntryUseCases: AppEntryUseCases,
) : ViewModel() {
    private val _currentPage = mutableStateOf(0)
    val currentPage: State<Int> = _currentPage


    fun onEvent(event: StepperEvent) {
        when (event) {
            is StepperEvent.SaveAppEntry -> {
                saveAppEntry()
            }

            is StepperEvent.ReadAppEntry -> {
                readAppEntry()
            }
        }
    }

    private fun readAppEntry() {
        viewModelScope.launch(Dispatchers.IO) {
            appEntryUseCases.readAppEntry()
        }
    }

    private fun saveAppEntry() {
        viewModelScope.launch(Dispatchers.IO) {
            appEntryUseCases.saveAppEntry()
        }
    }


}