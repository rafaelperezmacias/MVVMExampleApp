package com.rpm.mvvmexampleapp.data

import com.rpm.mvvmexampleapp.data.model.QuoteModel
import com.rpm.mvvmexampleapp.data.model.QuoteProvider
import com.rpm.mvvmexampleapp.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quoteList = response
        return response
    }

}