package com.codedev.newsapplication.domain.use_cases

import com.codedev.newsapplication.domain.entities.EntityArticle
import com.codedev.newsapplication.domain.repositories.NewsRepository
import kotlinx.coroutines.flow.onEach

class GetAllCacheArticles(
    private val repository: NewsRepository
) {

    suspend operator fun invoke() =
        repository.getAllArticles()
}