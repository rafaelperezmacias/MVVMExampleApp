package com.rpm.mvvmexampleapp.domain

import com.rpm.mvvmexampleapp.data.QuoteRepository
import com.rpm.mvvmexampleapp.data.model.QuoteModel
import com.rpm.mvvmexampleapp.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository: QuoteRepository
) {

    suspend operator fun invoke(): Quote? {
        val quotesList = repository.getAllQuoteFromDatabase()
        if ( quotesList.isNotEmpty() ) {
            return quotesList[quotesList.indices.random()]
        }
        return null
    }

}