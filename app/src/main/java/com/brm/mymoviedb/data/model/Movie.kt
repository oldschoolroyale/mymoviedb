package com.brm.mymoviedb.data.model

data class Movie(
    val page: Int,
    val subMovies: List<SubMovie>,
    val total_pages: Int,
    val total_results: Int
)