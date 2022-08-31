package com.example.marvelapp.framework.network

import com.example.marvelapp.framework.network.response.DataWrapperResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MarvelApi {

    @GET("characters")
    suspend fun getCharacters(
        @QueryMap options: Map<String, String>
    ): DataWrapperResponse
}