package com.example.ratha.recyclerviewpaginate_kt.callback

/**
 * Created by ratha on 1/3/2018.
 */
interface ResponseObjectCallback {
    fun <T> onSuccess(t :T)
    fun onFailure(message : String)
    fun onError()
    fun onComplete()
}