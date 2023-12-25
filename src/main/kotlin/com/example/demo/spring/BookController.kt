package com.example.demo.spring


import com.example.demo.data.BookInfo
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/book")
class BookController (
    private val bookService: BookService,
) {
    @GetMapping
    fun getAll(): List<BookInfo> = bookService.getAll()
   /* @GetMapping
    fun getAll(): List<BookInfo> = {}*/
    @PostMapping("/save")
    fun save(@RequestBody bookInfo: BookInfo):BookInfo{
        bookService.save(bookInfo)
    return bookInfo
    }

    @GetMapping("/lastN")
    fun getLastNRecords(@RequestParam(required = true, defaultValue = "10") n: Int): List<BookInfo> {
        return bookService.getLastNRecords(n)
    }

    @GetMapping("/range")
    fun getRecordsInRange(
        @RequestParam(required = true, defaultValue = "70") startIndex: Int,
        @RequestParam(required = true, defaultValue = "120") endIndex: Int
    ): List<BookInfo> {
        return bookService.getRecordsInRange(startIndex, endIndex)
    }

    @GetMapping("/allByGenre")
    fun getAllByGenre(
        @RequestParam(required = true) genre: String,
        @RequestParam(required = true, defaultValue = "0") startIndex: Int,
        @RequestParam(required = true, defaultValue = "9") endIndex: Int
    ): List<BookInfo> {
        return bookService.getAllByGenre(genre, startIndex, endIndex)
    }

    @GetMapping("/byAuthor")
    fun getBooksByAuthor(@RequestParam(required = true) autor: String): List<BookInfo> {
        return bookService.getAllByAutor(autor)
    }
    @GetMapping("/byAuthorAndCycle")
    fun getBooksByAuthorAndCycle(
        @RequestParam(required = true) autor: String,
        @RequestParam(required = true) cycle: String
    ): List<BookInfo> {
        return bookService.getBooksByAuthorAndCycle(autor, cycle)
    }

    @GetMapping("/search")
    fun searchBooksByName(@RequestParam name: String): List<BookInfo> {
        return bookService.getBooksByNameContaining(name)
    }

}