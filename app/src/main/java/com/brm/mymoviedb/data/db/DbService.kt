package com.brm.mymoviedb.data.db

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
interface DbService {

    fun savePopularMovies()

    fun saveLatestMovies()
}