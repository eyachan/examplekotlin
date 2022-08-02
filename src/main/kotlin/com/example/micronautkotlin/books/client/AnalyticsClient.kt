package com.example.micronautkotlin.books.client

import com.example.micronautkotlin.books.model.Book
import io.micronaut.rabbitmq.annotation.Binding
import io.micronaut.rabbitmq.annotation.RabbitClient

@RabbitClient("micronaut")
interface AnalyticsClient {

    @Binding("analytics")
    fun updateAnalytics(book: Book)
}