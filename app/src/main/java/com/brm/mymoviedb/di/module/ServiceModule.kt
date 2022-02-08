package com.brm.mymoviedb.di.module

import com.brm.mymoviedb.data.network.HttpApi
import com.brm.mymoviedb.data.network.repo.MovieService
import com.brm.mymoviedb.data.network.repo.MovieServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Rakhimjonov Shokhsulton on 08,февраль,2022
 * at Mayasoft LLC,
 * Tashkent, UZB.
 */
@InstallIn(SingletonComponent::class)
@Module
class ServiceModule {

    @Provides
    @Singleton
    fun provideMovieService(httpApi: HttpApi): MovieService{
        return MovieServiceImpl(httpApi)
    }
}