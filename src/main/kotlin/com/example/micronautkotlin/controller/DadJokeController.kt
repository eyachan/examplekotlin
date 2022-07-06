package com.example.micronautkotlin.controller


import com.example.micronautkotlin.client.DadJokeClient
import com.example.micronautkotlin.model.DadJoke
import com.example.micronautkotlin.model.DadJokePagedResults
import io.micronaut.http.MediaType.TEXT_PLAIN
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import reactor.core.publisher.Mono

@Controller("/dadJokes")
class DadJokeController {

    @Inject
    lateinit var dadJokeClient: DadJokeClient

    @Get(uri = "/joke", produces = [TEXT_PLAIN])
    fun getAJoke(): Mono<String> {
        return Mono.from(dadJokeClient.tellMeAJoke()).map(DadJoke::joke)
    }

    @Get("/dogJokes")
    fun getDogJokes(): Mono<List<DadJoke>> {
        return dadJokeClient.getDogJokes()
    }

    fun DadJokeClient.getDogJokes(): Mono<List<DadJoke>> {
        return Mono.from(this.searchDadJokes("dog")).map(DadJokePagedResults::results)
    }

}