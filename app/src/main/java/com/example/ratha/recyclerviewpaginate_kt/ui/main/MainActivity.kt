package com.example.ratha.recyclerviewpaginate_kt.ui.main

import android.app.Fragment
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import com.example.ratha.recyclerviewpaginate_kt.R
import com.example.ratha.recyclerviewpaginate_kt.base.BaseActivity
import com.example.ratha.recyclerviewpaginate_kt.ui.adapter.BookAdapter
import com.example.ratha.recyclerviewpaginate_kt.entity.response.Book
import com.example.ratha.recyclerviewpaginate_kt.ui.main.fragment.favorite.FavoriteFragment
import com.example.ratha.recyclerviewpaginate_kt.ui.main.fragment.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(),NavigationView.OnNavigationItemSelectedListener{

    lateinit var bookAdapter : BookAdapter;
    var bookList : MutableList<Book> = mutableListOf()

    init {
        bookAdapter=BookAdapter(this,bookList)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*mainRecyclerView.layoutManager=LinearLayoutManager(this)
        mainRecyclerView.adapter=bookAdapter
        setBooks()*/

        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        var fragment : Fragment?=null
        val transition = fragmentManager.beginTransaction()
        var name: String =""

        when (item.itemId){
            R.id.home->{
                fragment= HomeFragment()
                name="home"
            }
            R.id.profile->{
                fragment= FavoriteFragment()
                name="Favorite"
            }
            R.id.credit->{
            }
            R.id.share->{
            }
            R.id.favorite->{
            }
            R.id.gallery->{
            }
            R.id.logout->{
            }
        }

        transition.replace(R.id.homeContent,fragment,name).commit()

        return true
    }

}
