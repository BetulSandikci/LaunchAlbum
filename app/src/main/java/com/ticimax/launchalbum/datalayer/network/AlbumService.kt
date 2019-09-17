package com.ticimax.launchalbum.datalayer.network

import com.ticimax.launchalbum.datalayer.network.response.AlbumResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AlbumService {

    @GET("{apiVersion}")

    fun getAlbum(

        @Path("apiVersion") apiVersion: String,
        @Query("_format") _format: String,
        @Query("access-token") token: String
    ): Call<AlbumResponse>

}