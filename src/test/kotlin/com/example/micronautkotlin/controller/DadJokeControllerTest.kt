package com.example.micronautkotlin.controller

import com.example.micronautkotlin.model.DadJoke
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.kotlin.context.createBean
import io.micronaut.kotlin.context.run
import io.micronaut.kotlin.http.retrieveList
import io.micronaut.kotlin.http.retrieveObject
import io.micronaut.runtime.server.EmbeddedServer
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

internal class DadJokeControllerTest {
    @Test
    fun testDadJokeController() {
        val embeddedServer = run<EmbeddedServer>()
        val client = embeddedServer.applicationContext.createBean<HttpClient>(embeddedServer.url).toBlocking()

        // Test single object retrieve extension
        val anyJoke = client.retrieveObject<String>(HttpRequest.GET("/dadJokes/joke"))
        assertFalse(anyJoke.isNullOrBlank())

        // Test list retrieve extension
        val dogJoke = client.retrieveList<DadJoke>(HttpRequest.GET("/dadJokes/dogJokes"))
        assertFalse(dogJoke.isEmpty())
        assertFalse(dogJoke.first().joke.isNullOrBlank())

        client.close()
        embeddedServer.close()
    }
}