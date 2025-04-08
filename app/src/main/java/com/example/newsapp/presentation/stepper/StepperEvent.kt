package com.example.newsapp.presentation.stepper

sealed class StepperEvent {
    object SaveAppEntry : StepperEvent()
    object ReadAppEntry : StepperEvent()
}