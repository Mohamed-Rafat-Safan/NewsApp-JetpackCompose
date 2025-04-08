package com.example.newsapp.domain.usecases.news.remote

import androidx.paging.PagingData
import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepo
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val newsRepo: NewsRepo,
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepo.getNews(sources = sources)
    }

}