package com.example.ratha.recyclerviewpaginate_kt.base

/**
 * Created by ratha on 1/4/2018.
 */
interface MvpView {
    fun onShowLoading()
    fun onHideLoading()
    fun onError(message : String)
    fun onSuccess(message : String)
}