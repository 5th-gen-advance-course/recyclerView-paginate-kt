package com.example.ratha.recyclerviewpaginate_kt.ui.main.fragment.home

import android.app.Fragment
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ratha.recyclerviewpaginate_kt.R
import com.example.ratha.recyclerviewpaginate_kt.entity.response.Book
import com.example.ratha.recyclerviewpaginate_kt.ui.adapter.BookAdapter
import kotlinx.android.synthetic.main.home_fragment_layout.*

/**
 * Created by ratha on 1/3/2018.
 */
class HomeFragment : Fragment() {
    lateinit var bookAdapter : BookAdapter
    var bookList : MutableList<Book> = mutableListOf()
    init {
        bookAdapter= BookAdapter(activity,this.bookList)

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.home_fragment_layout,container,false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookRecyclerView.layoutManager=LinearLayoutManager(activity)
        bookRecyclerView.adapter=bookAdapter
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