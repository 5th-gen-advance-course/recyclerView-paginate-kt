package com.example.ratha.recyclerviewpaginate_kt.entity

/**
 * Created by ratha on 1/3/2018.
 */
data class Book( val title: String , val author: String ) {
    lateinit var viewer: String;
    constructor(  title: String , author: String , viewer : String)
            :this(title,author){
            this.viewer=viewer
    }

    fun getAllData(): Book{
        return Book(this.title,this.author,this.viewer)
    }

}