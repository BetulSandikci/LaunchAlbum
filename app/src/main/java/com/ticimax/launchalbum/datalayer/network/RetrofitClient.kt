package com.ticimax.launchalbum.datalayer.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {


    companion object {

        private const val  BASE_URL = "https://gorest.co.in/public-api/"

        fun getClient () : Retrofit {

            return with(Retrofit.Builder()){
                this.baseUrl(BASE_URL)
                this.addConverterFactory(GsonConverterFactory.create())
                this.build()


            }
        }
    }
}