package com.example.micronautkotlin

import io.micronaut.context.env.Environment.DEVELOPMENT
import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
	build()
		.args(*args)
		.packages("com.example.micronautkotlin")
		.defaultEnvironments(DEVELOPMENT)
		.start()
}
