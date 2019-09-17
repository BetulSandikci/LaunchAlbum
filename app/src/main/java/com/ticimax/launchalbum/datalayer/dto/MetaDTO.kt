package com.ticimax.launchalbum.datalayer.dto

data class MetaDTO(

    val success: Int,
    val code: Int,
    val message: String,
    val totalCount : Int,
    val pageCount :Int ,
    val currentPage : Int,
    val perPage : Int,
    val rateLimit: List<RateLimitDTO>


)