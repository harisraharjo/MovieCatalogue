package com.dicoding.submission.moviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShow(
    val posterId: Int = 0,
    val title: String,
    val desc: String = "",
    val rating: Int = 0,
    val releaseDate: String,
    val runtime: String = "",
    val cast: List<Cast>,
    val creator: String,
    val genres: List<String>,
    val status: String,
    val network: Int
) : Parcelable