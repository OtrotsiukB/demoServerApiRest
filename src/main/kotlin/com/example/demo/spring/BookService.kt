package com.example.demo.spring

import com.example.demo.data.BookInfo


interface BookService {
    fun getAll(): List<BookInfo>
    fun save(bookInfo: BookInfo) : BookInfo
   // fun getAllBook(numberFrom:Int):List<BookInfo>

    fun getLastNRecords(n: Int): List<BookInfo>
    fun getRecordsInRange(startIndex: Int, endIndex: Int): List<BookInfo>

    fun getAllByGenre(genre: String, startIndex: Int, endIndex: Int): List<BookInfo>

    fun getAllByAutor(autor: String): List<BookInfo>

    fun getBooksByAuthorAndCycle(autor: String, cycle: String): List<BookInfo>


    fun getBooksByNameContaining(name: String): List<BookInfo>

    fun incrementViewCount(bookId: String): BookInfo?


    fun incrementRaitingPlus(bookId: String): BookInfo?
    fun incrementRaitingMinus(bookId: String): BookInfo?
}