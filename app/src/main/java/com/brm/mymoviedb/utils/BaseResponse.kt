package com.brm.mymoviedb.utils

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */

data class BaseResponse <T> (val status_code : Int,val data : T? ,val error_text : String? = null)

enum class Status{
    LOADING,SUCCESS,ERROR
}
data class BaseModel <T>(val status: Status, val response: BaseResponse<T>?)