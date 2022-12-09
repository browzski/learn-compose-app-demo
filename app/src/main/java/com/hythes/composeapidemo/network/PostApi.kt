package com.hythes.composeapidemo.network

import com.hythes.composeapidemo.network.model.PostModel
import retrofit2.http.GET


interface PostApi{
    @GET("posts")
    suspend fun getPosts() : List<PostModel>
}