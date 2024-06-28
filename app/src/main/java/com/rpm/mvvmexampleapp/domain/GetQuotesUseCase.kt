package com.rpm.mvvmexampleapp.domain

import com.rpm.mvvmexampleapp.data.QuoteRepository
import com.rpm.mvvmexampleapp.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? {
        return repository.getAllQuotes()
    }

}