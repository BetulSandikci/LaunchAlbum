package com.ticimax.launchalbum.datalayer.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.ticimax.launchalbum.datalayer.dto.ResultListDTO
import com.ticimax.launchalbum.datalayer.network.SendRequest
import com.ticimax.launchalbum.datalayer.network.response.AlbumResponse
import com.ticimax.launchalbum.viewmodel.BaseRepository

class AlbumRepository : BaseRepository() {

    var album: MutableLiveData<List<ResultListDTO>> = MutableLiveData()
    var allData: MutableLiveData<AlbumResponse> = MutableLiveData()


    init {
        sendRequest()
        getAlbum()
    }

    private fun sendRequest() {

        SendRequest.getAlbum({ _, response ->
            album.postValue(response.body()!!.albumList as List<ResultListDTO>?)
        }, { _, _ ->

            Log.e("Album List", "Something Got Wrong !!!")

        })

    }

    private fun getAlbum() {
        SendRequest.getAlbum({ _, _response ->
            allData.postValue(_response.body()!!)
        }, { _, _ ->
            Log.e("All Data", "Something Got Wrong !!!")
        })
    }


}