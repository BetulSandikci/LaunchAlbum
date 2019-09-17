package com.ticimax.launchalbum.datalayer.dto

data class AlbumDTO (  val id: Int ,
                       val album_id :Int,
                       val title :String,
                       val url :String,
                       val thumbnail :String,
                       val _links : LinksDTO
)
