package com.example.newsapp.domain.usecases.news.local

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepo

class GetArticle(
    private val newRepo: NewsRepo,
) {

    suspend operator fun invoke(url: String): Article? {
        return newRepo.getArticle(url = url)
    }

}