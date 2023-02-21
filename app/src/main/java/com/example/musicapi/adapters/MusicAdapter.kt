package com.example.musicapi.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapi.R
import com.example.musicapi.models.music.MusicModel

class MusicAdapter(private val musicList: List<MusicModel>): RecyclerView.Adapter<MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        return MusicViewHolder(layoutInflater.inflate(R.layout.music_item, parent, false));
    }


    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val item = musicList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = musicList.size

}