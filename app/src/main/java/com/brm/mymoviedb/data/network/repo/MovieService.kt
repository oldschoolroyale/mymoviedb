package com.brm.mymoviedb.data.network.repo

import com.brm.mymoviedb.data.model.Movie
import com.brm.mymoviedb.utils.BaseResponse

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
interface MovieService {

    fun getPopular(): BaseResponse<Movie>

    fun setAccessToken(accessToken: String)
}