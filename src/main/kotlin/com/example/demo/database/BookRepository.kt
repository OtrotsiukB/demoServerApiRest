package com.example.demo.database

import com.example.demo.data.BookInfo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//работа с базой данных
@Repository
interface BookRepository : MongoRepository<BookInfo, String> {
    fun save(book: BookInfo)
    // Метод для выгрузки одиночной книги по идентификатору
   // override fun findById(id: String): Optional<BookInfo>
    // Метод для выгрузки всех книг
    override fun findAll(): List<BookInfo>

}
