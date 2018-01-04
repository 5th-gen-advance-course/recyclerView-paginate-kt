package com.example.ratha.recyclerviewpaginate_kt.ui.main

import android.app.Fragment
import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.widget.BaseAdapter
import com.example.ratha.recyclerviewpaginate_kt.R
import com.example.ratha.recyclerviewpaginate_kt.base.BaseActivity
import android.support.v4.widget.DrawerLayout
import android.view.MenuItem
import android.widget.FrameLayout
import com.example.ratha.recyclerviewpaginate_kt.ui.main.fragment.favorite.FavoriteFragment
import com.example.ratha.recyclerviewpaginate_kt.ui.main.fragment.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : BaseActivity() ,NavigationView.OnNavigationItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //set event to navigationView
        navigationView.setNavigationItemSelectedListener(this)

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        var fragment :Fragment? = null
        val transition = fragmentManager.beginTransaction()
        var name: String =""

        when (item.itemId){
            R.id.home->{
                fragment=HomeFragment()
                name="home"
            }
            R.id.profile->{
                fragment=FavoriteFragment()
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

        transition.replace(R.id.homeContent,fragment!!,name).commit()

        return true
    }
}
