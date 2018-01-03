package com.example.ratha.recyclerviewpaginate_kt.callback

/**
 * Created by ratha on 1/3/2018.
 */
interface CallBackMessage {
    fun onSuccess()
    fun onError()
    fun onFailed(msg : String);
}