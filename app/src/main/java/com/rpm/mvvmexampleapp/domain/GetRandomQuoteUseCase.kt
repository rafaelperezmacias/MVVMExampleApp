package com.rpm.mvvmexampleapp.domain

import com.rpm.mvvmexampleapp.data.model.QuoteModel
import com.rpm.mvvmexampleapp.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel? {
        val quotesList = QuoteProvider.quoteList
        if ( quotesList.isNotEmpty() ) {
            return quotesList[quotesList.indices.random()]
        }
        return null
    }

}