package com.example.musicapi.models

import com.google.gson.annotations.SerializedName

data class UserResponse (
    @SerializedName("userId")
    val userId: Int? = null,

    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("completed")
    val completed: Boolean? = null,
)

data class User (
    @SerializedName("userId")
    val userId: Int? = null,

    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("completed")
    val completed: Boolean? = null,
)