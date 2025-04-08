package com.example.newsapp.domain.usecases.news.remote

import com.example.newsapp.domain.repository.NewsRepo

class SearchNews(
    private val newsRepo: NewsRepo,
) {
    operator fun invoke(
        searchQuery: String,
        sources: List<String>,
    ) = newsRepo.searchNews(searchQuery = searchQuery, sources = sources)
}