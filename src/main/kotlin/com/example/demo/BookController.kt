package com.example.demo


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController (
    private val bookService: BookService,
) {
    @GetMapping
    fun getAll(): List<BookInfo> = bookService.getAll()
}