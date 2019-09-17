package com.ticimax.launchalbum.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ticimax.launchalbum.datalayer.dto.ResultListDTO

class AlbumListAdapter(

    private val albumList: List<ResultListDTO>? = null
) : RecyclerView.Adapter<AlbumListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumListViewHolder {
        return AlbumListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return albumList!!.size
    }

    override fun onBindViewHolder(holder: AlbumListViewHolder, position: Int) {

        holder.bind(albumList!![position])
    }

}