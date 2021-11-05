package com.codedev.newsapplication.data.models

import kotlinx.serialization.Serializable

@Serializable
data class NewsResponse(
    val articles: List<ArticleDTO>,
    val status: String,
    val totalResults: Int
)