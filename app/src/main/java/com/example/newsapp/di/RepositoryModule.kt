package com.example.newsapp.di

import com.example.newsapp.data.local.NewsDao
import com.example.newsapp.data.remote.NewsApi
import com.example.newsapp.data.repository.NewsRepoImpl
import com.example.newsapp.domain.repository.NewsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi,
        newsDao: NewsDao,
    ): NewsRepo {
        return NewsRepoImpl(newsApi, newsDao)
    }

}