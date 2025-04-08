package com.example.newsapp.domain.usecases.news

import com.example.newsapp.domain.usecases.news.local.DeleteArticle
import com.example.newsapp.domain.usecases.news.local.GetArticle
import com.example.newsapp.domain.usecases.news.local.GetArticles
import com.example.newsapp.domain.usecases.news.local.UpsertArticle
import com.example.newsapp.domain.usecases.news.remote.GetNews
import com.example.newsapp.domain.usecases.news.remote.SearchNews

data class NewsUseCases(
    val getNews: GetNews,
    val searchNews: SearchNews,
    val upsertArticle: UpsertArticle,
    val getArticles: GetArticles,
    val deleteArticle: DeleteArticle,
    val getArticle: GetArticle,
)
