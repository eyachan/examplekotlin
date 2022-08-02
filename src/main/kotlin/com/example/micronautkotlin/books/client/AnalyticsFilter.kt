package com.example.micronautkotlin.books.client

import com.example.micronautkotlin.books.model.Book
import io.micronaut.http.HttpRequest
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Filter
import io.micronaut.http.filter.HttpServerFilter
import io.micronaut.http.filter.ServerFilterChain
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Filter("/books/?*")
class AnalyticsFilter(private val analyticsClient: AnalyticsClient)
    : HttpServerFilter {

    override fun doFilter(request: HttpRequest<*>,
                          chain: ServerFilterChain): Publisher<MutableHttpResponse<*>> =
        Flux
            .from(chain.proceed(request))
            .flatMap { response: MutableHttpResponse<*> ->
                Mono.fromCallable {
                    val book = response.getBody(Book::class.java)
                    book.ifPresent { book: Book -> analyticsClient.updateAnalytics(book) }

                    response
                }
            }
}