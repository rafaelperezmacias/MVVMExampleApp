package com.rpm.mvvmexampleapp.data.network

import com.rpm.mvvmexampleapp.core.RetrofitHelper
import com.rpm.mvvmexampleapp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class QuoteService @Inject constructor(
    private val api: QuoteApiClient
) {

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            delay(1000)
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}