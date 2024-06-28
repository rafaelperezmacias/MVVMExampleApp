package com.rpm.mvvmexampleapp.data.network

import com.rpm.mvvmexampleapp.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>

}