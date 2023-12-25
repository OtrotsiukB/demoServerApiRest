package com.example.demo.data

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

//@Document(collection = "books")
@Document(collection = "books")
data class BookInfo(
    val name:String,
    val urlImage:String,
    val autor:String,
    val year:String,
    val duration: String,
    val infoOfBook:String,
    val cycle: String = "",
    val numberCycle:String="",
    val genre: List<String>,
    val idInArhive: String,
    val raitingPlus:Int = 0,
    val raitingMinus:Int =0,
    val viewUser:Int = 0,
    @CreatedDate
    val createdAt: LocalDateTime? = null,
    @Id
    val id:String?=null


)
