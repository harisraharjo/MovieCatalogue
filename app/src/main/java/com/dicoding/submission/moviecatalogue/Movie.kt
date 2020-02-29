package com.dicoding.submission.moviecatalogue

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    val posterId: Int = 0,
    val title: String,
    val desc: String = "",
    val rating: Int = 0,
    val releaseDate: String,
    val runtime: String = "",
    val cast: List<Cast>,
    val director: String,
    val genres: List<String>
): Parcelable