package com.example.ratha.recyclerviewpaginate_kt.callback

/**
 * Created by ratha on 1/3/2018.
 */
interface ResponseListCallback {
    fun <T> onSuccess(list : List<T>)
}