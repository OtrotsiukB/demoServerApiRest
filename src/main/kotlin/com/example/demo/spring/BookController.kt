package com.example.demo.spring


import com.example.demo.data.BookInfo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController (
    private val bookService: BookService,
) {
    @GetMapping
    fun getAll(): List<BookInfo> = bookService.getAll()
   /* @GetMapping
    fun getAll(): List<BookInfo> = {}*/
    @PostMapping("/add")
    fun save(bookInfo: BookInfo) = bookService.addBook(bookInfo)
}