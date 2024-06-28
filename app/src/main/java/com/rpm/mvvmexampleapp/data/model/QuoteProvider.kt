package com.rpm.mvvmexampleapp.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor() {

    var quoteList: List<QuoteModel> = emptyList()

}