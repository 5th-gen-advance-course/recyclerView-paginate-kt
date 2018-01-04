package com.example.ratha.recyclerviewpaginate_kt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.ratha.recyclerviewpaginate_kt.adapter.BookAdapter
import com.example.ratha.recyclerviewpaginate_kt.entity.response.Book
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var bookAdapter : BookAdapter;
    var bookList : MutableList<Book> = mutableListOf()

    init {
        bookAdapter=BookAdapter(this,bookList)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainRecyclerView.layoutManager=LinearLayoutManager(this)
        mainRecyclerView.adapter=bookAdapter
        setBooks()
    }

    private fun setBooks(){
        this.bookList= mutableListOf(
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK"),
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK"),
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK"),
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK"),
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK"),
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK"),
                Book(title = "Kotlin 1", author = "Kotlin lang", viewer = "100OIK")
        )
        bookAdapter.setBooks(this.bookList)
    }

}
