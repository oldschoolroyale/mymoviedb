package com.brm.mymoviedb.ui.splash

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brm.mymoviedb.data.network.repo.MovieService
import com.brm.mymoviedb.data.network.repo.MovieServiceImpl
import com.brm.mymoviedb.exceptions.MovieDbNetworkException
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
@HiltViewModel
class SplashViewModel @Inject constructor(
    private val movieService: MovieService
) : ViewModel() {

    private val _status = MutableLiveData(false)
    val status get() = _status

    @Throws(MovieDbNetworkException::class)
    fun startDataRetrieve() = viewModelScope.launch {
        val response = withContext(CoroutineScope(Dispatchers.IO).coroutineContext){
            movieService.getPopular()
        }
        if (response.status_code == 200) {

            _status.value = true
        }
        else
            throw MovieDbNetworkException("1")
    }



}