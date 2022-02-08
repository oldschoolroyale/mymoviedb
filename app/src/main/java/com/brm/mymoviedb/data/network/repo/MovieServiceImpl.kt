package com.brm.mymoviedb.data.network.repo

import com.brm.mymoviedb.data.model.Movie
import com.brm.mymoviedb.data.network.HttpApi
import com.brm.mymoviedb.exceptions.MovieDbNetworkException
import com.brm.mymoviedb.utils.BaseResponse
import javax.inject.Inject

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
class MovieServiceImpl (private val httpApi: HttpApi) : MovieService{

    private var accessToken: String = ""

    fun getPopular() : BaseResponse<Movie>{
        return  try {
            val resp = httpApi.getPopularMovies(getAccessToken()).execute()
            BaseResponse(resp.code(), resp.body(), resp.errorBody()?.toString())
        }
        catch (e: Exception){
            BaseResponse(500, null, e.toString())
        }
    }

    private fun getAccessToken(): String{
        return accessToken
    }

    fun setAccessToken(accessToken: String){
        this.accessToken = accessToken;
    }
}