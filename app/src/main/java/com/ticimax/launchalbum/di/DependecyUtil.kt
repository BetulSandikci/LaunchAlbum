package com.ticimax.launchalbum.di

import com.ticimax.launchalbum.datalayer.repository.AlbumRepository

object DependecyUtil{


    fun getAlbumRepository ():AlbumRepository = AlbumRepository()
}