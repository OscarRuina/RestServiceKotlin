package com.oscarruina.labsserviciosrest.endpoints

import com.oscarruina.labsserviciosrest.dtos.Post
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoints {

    @GET("/posts")
    fun getPosts() : Call<List<Post>>
}