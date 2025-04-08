package com.example.newsapp.domain.usecases.news.local

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepo

class UpsertArticle(
    private val newsRepo: NewsRepo,
) {

    suspend operator fun invoke(article: Article) {
        newsRepo.upsertArticle(article = article)
    }
}