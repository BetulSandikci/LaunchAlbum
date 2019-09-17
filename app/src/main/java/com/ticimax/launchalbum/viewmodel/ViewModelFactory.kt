package com.ticimax.launchalbum.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ticimax.launchalbum.datalayer.repository.AlbumRepository

class ViewModelFactory constructor(private val repository: BaseRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return if (modelClass.isAssignableFrom(AlbumViewModel::class.java)) {

            AlbumViewModel(this.repository as AlbumRepository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")

        }
    }


}