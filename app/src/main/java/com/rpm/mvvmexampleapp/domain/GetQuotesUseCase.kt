package com.rpm.mvvmexampleapp.domain

import com.rpm.mvvmexampleapp.data.QuoteRepository
import com.rpm.mvvmexampleapp.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository
) {

    suspend operator fun invoke(): List<QuoteModel>? {
        return repository.getAllQuotes()
    }

}