package com.dicoding.submission.moviecatalogue

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cast (val realname: String, val moviename: String, val img: Int): Parcelable