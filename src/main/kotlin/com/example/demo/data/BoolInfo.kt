package com.example.demo.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "books")
data class BookInfo(
    val name:String,
    val urlImage:String,
    val autor:String,
    val year:String,
    val duration: String,
    val infoOfBook:String,
    val cycle: String = "",
    val numberCycle:Double,
    val genre: List<String>,
    val idInArhive: String,
    val raitingPlus:Int = 0,
    val raitingMinus:Int =0,
    val viewUser:Int = 0,
    @Id
    val id:String?=null

)
