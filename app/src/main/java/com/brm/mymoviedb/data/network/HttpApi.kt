package com.brm.mymoviedb.data.network

import com.brm.mymoviedb.data.model.Movie
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
interface HttpApi {

    @GET("movie/popular")
    fun getPopularMovies(accessToken: String): Call<Movie>


}