package com.example.musicapi.models.music

import com.google.gson.annotations.SerializedName

data class MusicModel  (
    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("name")
    val name: String? = null,
) {}
