package com.rpm.mvvmexampleapp.domain

import com.rpm.mvvmexampleapp.data.QuoteRepository
import com.rpm.mvvmexampleapp.data.mapper.toEntity
import com.rpm.mvvmexampleapp.data.model.QuoteModel
import com.rpm.mvvmexampleapp.domain.model.Quote
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository: QuoteRepository
) {

    suspend operator fun invoke(): List<Quote> {
        val quoteList = repository.getAllQuotesFromAPI()
        return if ( quoteList.isNotEmpty() ) {
            repository.clearQuotes()
            repository.insertQuotes(quoteList.map { it.toEntity() })
            quoteList
        } else {
            repository.getAllQuoteFromDatabase()
        }
    }

}