package com.example.demo.database

import com.example.demo.data.BookInfo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort

//работа с базой данных
@Repository
interface BookRepository : MongoRepository<BookInfo, String> {
    fun save(book: BookInfo)
    // Метод для выгрузки одиночной книги по идентификатору
   // override fun findById(id: String): Optional<BookInfo>
    // Метод для выгрузки всех книг
    override fun findAll(): List<BookInfo>

    @Query("{}")
    fun findLastNRecords(pageable: Pageable): List<BookInfo>
    //от и до
    @Query("{}")
    fun findRecordsInRange(pageable: Pageable): List<BookInfo>
    //жанр последние

    @Query("{ 'genre' : ?0 }")
    fun findAllByGenre(genre: String, sort: Sort): List<BookInfo>

    @Query("{ 'autor' : ?0 }")
    fun findAllByAutor(autor: String): List<BookInfo>


}
