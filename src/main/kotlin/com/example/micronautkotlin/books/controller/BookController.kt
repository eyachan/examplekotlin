package com.example.micronautkotlin.books.controller

import com.example.micronautkotlin.books.model.Book
import com.example.micronautkotlin.books.service.BookService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.util.*

@Controller("/books")
class BookController(private val bookService: BookService) {

    @Get("/all")
    fun listAll(): List<Book> = bookService.listAll()

    @Get("/{isbn}")
    fun findBook(isbn: String): Optional<Book> = bookService.findByIsbn(isbn)
}