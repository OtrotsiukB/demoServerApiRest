package com.example.demo.spring

import com.example.demo.data.BookInfo


interface BookService {
    fun getAll(): List<BookInfo>
    fun save(bookInfo: BookInfo) : BookInfo
   // fun getAllBook(numberFrom:Int):List<BookInfo>

    fun getLastNRecords(n: Int): List<BookInfo>
    fun getRecordsInRange(startIndex: Int, endIndex: Int): List<BookInfo>

    fun getAllByGenre(genre: String): List<BookInfo>




}