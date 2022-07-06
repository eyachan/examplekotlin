package com.example.micronautkotlin

import io.micronaut.kotlin.runtime.startApplication

object ApplicationKt {
	@JvmStatic
	fun main(args: Array<String>) {
		startApplication<ApplicationKt>(*args)
	}
}

