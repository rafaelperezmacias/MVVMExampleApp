package com.rpm.mvvmexampleapp.data

import com.rpm.mvvmexampleapp.data.model.QuoteModel
import com.rpm.mvvmexampleapp.data.model.QuoteProvider
import com.rpm.mvvmexampleapp.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quoteList = response
        return response
    }

}