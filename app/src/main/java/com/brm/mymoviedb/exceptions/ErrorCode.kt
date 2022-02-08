package com.brm.mymoviedb.exceptions

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
enum class ErrorCode constructor(val code: String, message: String) {
    ERROR_MOVIE_RETRIEVE("1", "error_movie_retrieve"),
    ERROR_UNKNOWN("999", "error_unknown");

    fun findErrorByCode(code: String): ErrorCode{
        for (i in ErrorCode.values()){
            if (code == i.code){
                return i
            }
        }
        return ERROR_UNKNOWN
    }
}