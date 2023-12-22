package com.example.demo.spring

import com.example.demo.data.BookInfo


interface BookService {
    fun getAll(): List<BookInfo>
    fun addBook(bookInfo: BookInfo)


}