package com.ticimax.launchalbum.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ticimax.launchalbum.datalayer.dto.ResultListDTO
import com.ticimax.launchalbum.datalayer.network.response.AlbumResponse
import com.ticimax.launchalbum.datalayer.repository.AlbumRepository

class AlbumViewModel(albumRepository: AlbumRepository) : ViewModel() {

    val live_album: MutableLiveData<List<ResultListDTO>> = albumRepository.album
    val live_allData: MutableLiveData<AlbumResponse> = albumRepository.allData
}