package com.example.newsapp.domain.usecases.news.local

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepo
import kotlinx.coroutines.flow.Flow

class GetArticles(
    private val newsRepo: NewsRepo,
) {

    operator fun invoke(): Flow<List<Article>> {
        return newsRepo.getArticles()
    }

}