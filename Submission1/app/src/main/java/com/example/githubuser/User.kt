package com.example.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var photo: Int,
    var name: String,
    var username: String,
    var follower: String,
    var following: String,
    var location: String,
    var company: String,
    var repository: String
) : Parcelable