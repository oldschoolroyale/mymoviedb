package com.brm.mymoviedb.ui

import androidx.fragment.app.Fragment
import java.lang.Exception

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
open class HomeFragment : Fragment() {

    fun onRequestError(message: Any){
        when(message){
            is Exception ->{}
            is String ->{}
            is Int ->{}
            else ->{}
        }
    }

    fun onRequestStart(title: Any){

    }

    fun onRequestComplete(){

    }
}