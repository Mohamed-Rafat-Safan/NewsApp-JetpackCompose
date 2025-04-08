package com.example.newsapp.di

import com.example.newsapp.domain.repository.NewsRepo
import com.example.newsapp.domain.usecases.news.NewsUseCases
import com.example.newsapp.domain.usecases.news.local.DeleteArticle
import com.example.newsapp.domain.usecases.news.local.GetArticle
import com.example.newsapp.domain.usecases.news.local.GetArticles
import com.example.newsapp.domain.usecases.news.local.UpsertArticle
import com.example.newsapp.domain.usecases.news.remote.GetNews
import com.example.newsapp.domain.usecases.news.remote.SearchNews
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideUseCase(
        newsRepo: NewsRepo,
    ): NewsUseCases {
        return NewsUseCases(
            getNews = GetNews(newsRepo),
            searchNews = SearchNews(newsRepo),
            upsertArticle = UpsertArticle(newsRepo),
            getArticles = GetArticles(newsRepo),
            deleteArticle = DeleteArticle(newsRepo),
            getArticle = GetArticle(newsRepo),
        )
    }

}