package com.rpm.mvvmexampleapp.data.mapper

import com.rpm.mvvmexampleapp.data.database.entities.QuoteEntity
import com.rpm.mvvmexampleapp.data.model.QuoteModel
import com.rpm.mvvmexampleapp.domain.model.Quote

fun QuoteModel.toDomain(): Quote {
    return Quote(quote = quote, author = author)
}

fun QuoteEntity.toDomain(): Quote {
    return Quote(quote = quote, author = author)
}

fun Quote.toEntity(): QuoteEntity {
    return QuoteEntity(quote = quote, author = author)
}
