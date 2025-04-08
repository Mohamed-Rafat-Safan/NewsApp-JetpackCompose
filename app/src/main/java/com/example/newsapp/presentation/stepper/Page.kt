package com.example.newsapp.presentation.stepper

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)


val pages = listOf(
    Page(
        title = "Welcome to News App",
        description = "Stay updated with the latest news from around the world. Get breaking stories, in-depth analysis, and trending topics, all in one place.",
        image = R.drawable.news_step1
    ),
    Page(
        title = "Explore News",
        description = "Discover the latest headlines, trending stories, and in-depth reports from around the world. Stay informed, anytime, anywhere.",
        image = R.drawable.news_step2
    ),
    Page(
        title = "Stay Updated",
        description = "Get the latest news, breaking stories, and real-time updates from around the world.",
        image = R.drawable.news_step3
    )
)