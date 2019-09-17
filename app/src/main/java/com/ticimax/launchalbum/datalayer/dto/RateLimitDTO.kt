package com.ticimax.launchalbum.datalayer.dto

data class RateLimitDTO(

    val limit: Int,
    val remaining: Int,
    val reset: Int

)