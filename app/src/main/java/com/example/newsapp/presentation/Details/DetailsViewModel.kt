package com.example.newsapp.presentation.Details

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.usecases.news.NewsUseCases
import com.example.newsapp.utils.UIComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val newsUseCases: NewsUseCases,
) : ViewModel() {

    var sideEffect by mutableStateOf<UIComponent?>(null)
        private set

    private val _saveState = mutableStateOf(false)
    val saveState: State<Boolean> = _saveState

    fun onEvent(event: DetailsEvent) {
        when (event) {
            is DetailsEvent.UpsertDeleteArticle -> {
                viewModelScope.launch {
                    val article = newsUseCases.getArticle(url = event.article.url)
                    if (article == null) { // this means the article is not in the database therefore we save in db
                        upsertArticle(article = event.article)
                        _saveState.value = true
                    } else {
                        deleteArticle(article = event.article)  // remove article
                        _saveState.value = false
                    }
                }
            }

            is DetailsEvent.CheckIfSaved -> {
                viewModelScope.launch {
                    val article = newsUseCases.getArticle(url = event.article.url)
                    _saveState.value = article != null
                }
            }

            is DetailsEvent.RemoveSideEffect -> {
                sideEffect = null
            }
        }
    }

    private suspend fun deleteArticle(article: Article) {
        newsUseCases.deleteArticle(article = article)
        sideEffect = UIComponent.Toast("Article deleted")
    }

    private suspend fun upsertArticle(article: Article) {
        newsUseCases.upsertArticle(article = article)
        sideEffect = UIComponent.Toast("Article Saved")
    }

}