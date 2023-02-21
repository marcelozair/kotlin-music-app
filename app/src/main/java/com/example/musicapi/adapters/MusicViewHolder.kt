package com.example.musicapi.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.musicapi.databinding.MusicItemBinding
import com.example.musicapi.models.music.MusicModel

class MusicViewHolder(private val view: View) : ViewHolder(view) {
    private val binding = MusicItemBinding.bind(view);

    val elementMusicId = binding.idMusic;
    val elementMusicTitle = binding.titleMusic;

    fun render(music: MusicModel) {
        elementMusicId.text = music.id.toString();
        elementMusicTitle.text = music.name;
    }
}