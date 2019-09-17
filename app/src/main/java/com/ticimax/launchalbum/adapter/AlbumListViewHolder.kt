package com.ticimax.launchalbum.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ticimax.launchalbum.datalayer.dto.ResultListDTO
import com.ticimax.launchalbum.R

class AlbumListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.album_adapter_list_item, parent, false)
) {

    private val  imgThumbNail  by lazy { itemView.findViewById<ImageView>(R.id.img_thumbnail) }
    private val txtDescription by lazy { itemView.findViewById<TextView>(R.id.txt_description) }

    fun bind(albumResponse: ResultListDTO) {

        imgThumbNail.loadImage(albumResponse.albumResultList[0].thumbnail)
        txtDescription.text = albumResponse.albumResultList[0].title


    }

}

fun ImageView.loadImage(imageUrl: String) {

    Glide.with(context).load(imageUrl).into(this)

}