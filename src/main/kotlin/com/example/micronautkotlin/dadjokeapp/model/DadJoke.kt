package com.example.micronautkotlin.dadjokeapp.model

import io.micronaut.core.annotation.Introspected

@Introspected
data class DadJoke(
    val id: String,
    val joke: String,
    val Status: Int
)