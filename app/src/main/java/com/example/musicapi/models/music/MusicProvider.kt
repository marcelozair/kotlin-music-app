package com.example.musicapi.models.music

import com.example.musicapi.models.music.MusicModel

class MusicProvider {
    companion object {
        val musicList = listOf<MusicModel>(
            MusicModel(1, "Daft Punk, Giorgio"),
            MusicModel(2, "The doors, Yes   The river"),
            MusicModel(3, "Lep zeppelin, Stairway to heaven"),
        )
    }
}