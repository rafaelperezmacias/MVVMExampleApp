package com.rpm.mvvmexampleapp.data

import com.rpm.mvvmexampleapp.data.database.dao.QuoteDao
import com.rpm.mvvmexampleapp.data.database.entities.QuoteEntity
import com.rpm.mvvmexampleapp.data.mapper.toDomain
import com.rpm.mvvmexampleapp.data.network.QuoteService
import com.rpm.mvvmexampleapp.domain.model.Quote
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao
) {

    suspend fun getAllQuotesFromAPI(): List<Quote> {
        val response = api.getQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun getAllQuoteFromDatabase(): List<Quote> {
        val response = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun insertQuotes(quoteList: List<QuoteEntity>) {
        quoteDao.insertAll(quoteList)
    }

    suspend fun clearQuotes() {
        quoteDao.deleteAll()
    }

}