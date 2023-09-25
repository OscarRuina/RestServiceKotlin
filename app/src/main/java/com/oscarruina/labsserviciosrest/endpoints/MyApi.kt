package com.oscarruina.labsserviciosrest.endpoints

import com.oscarruina.labsserviciosrest.dtos.Post
import retrofit2.Call
import retrofit2.http.GET

interface MyApi {

    @GET("/post")
    fun getPost() : Call<List<Post>>
}