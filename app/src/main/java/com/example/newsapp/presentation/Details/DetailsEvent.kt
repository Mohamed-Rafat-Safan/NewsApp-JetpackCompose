package com.example.newsapp.presentation.Details

import com.example.newsapp.domain.model.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    data class CheckIfSaved(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()
}