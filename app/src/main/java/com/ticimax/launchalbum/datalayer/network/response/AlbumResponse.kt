package com.ticimax.launchalbum.datalayer.network.response

import com.google.gson.annotations.SerializedName
import com.ticimax.launchalbum.datalayer.dto.ResultListDTO
import com.ticimax.launchalbum.datalayer.dto.MetaDTO


data class AlbumResponse(

    @field:SerializedName("_meta")
    val meta: MetaDTO,

    @field:SerializedName("result")

    val albumList: List<ResultListDTO?>


)