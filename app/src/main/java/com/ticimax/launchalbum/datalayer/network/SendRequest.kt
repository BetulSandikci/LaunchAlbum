package com.ticimax.launchalbum.datalayer.network

import com.ticimax.launchalbum.datalayer.network.response.AlbumResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object SendRequest {

    fun getAlbum(

        onResponse:
            (call: Call<AlbumResponse>, response: Response<AlbumResponse>) -> Unit,

        onFailure:
            (call: Call<AlbumResponse>, t: Throwable) -> Unit
    ) {

        RetrofitClient.getClient()
            .create(AlbumService::class.java)
            .getAlbum(
                apiVersion = "photos",
                _format = "json",
                token = "pLXcrIqVQpaZSLFfwtYQvpnYX60WHPbbVG_7"

            ).enqueue(object : Callback<AlbumResponse> {

                override fun onResponse(
                    call: Call<AlbumResponse>,
                    response: Response<AlbumResponse>
                ) {

                    onResponse(call, response)
                }

                override fun onFailure(call: Call<AlbumResponse>, t: Throwable) {
                    onFailure(call, t)
                }


            })


    }


}