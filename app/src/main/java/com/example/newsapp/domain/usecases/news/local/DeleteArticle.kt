package com.example.newsapp.domain.usecases.news.local

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepo

class DeleteArticle (
    private val newRepo: NewsRepo,
) {

    suspend operator fun invoke(article: Article){
        newRepo.deleteArticle(article = article)
    }

}