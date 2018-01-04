package com.example.ratha.recyclerviewpaginate_kt.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ratha.recyclerviewpaginate_kt.R
import com.example.ratha.recyclerviewpaginate_kt.entity.response.Book

/**
 * Created by ratha on 1/2/2018.
 */
class BookAdapter( val context: Context, var bookList : List<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder? , position: Int) {
        if(this.bookList.isEmpty() || null!=this.bookList){
            val book=this.bookList.get(position)
            val(title,author)=book
            val viewer=book.viewer
            holder!!.bookTitle.setText(title)
            holder!!.bookAuther.setText(author)
            holder!!.bookViewer.setText(viewer)
        }
    }

    fun setBooks(bookList : List<Book>){
        this.bookList=bookList

    }
    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(this.context).inflate(R.layout.main_item_recycler_view,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        lateinit var bookImage : ImageView;
        lateinit var bookTitle : TextView;
        lateinit var bookAuther : TextView;
        lateinit var bookViewer : TextView;
        lateinit var bookFavorite : ImageView;

        init {
            bookAuther=itemView.findViewById(R.id.bookAuther)
            bookImage=itemView.findViewById(R.id.bookImage)
            bookTitle=itemView.findViewById(R.id.bookTitle)
            bookViewer=itemView.findViewById(R.id.bookViewer)
            bookFavorite=itemView.findViewById(R.id.btnFavorite)
        }
    }

}