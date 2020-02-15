package com.tirgei.retrofitauthorization.data

import com.tirgei.retrofitauthorization.data.requests.LoginRequest
import com.tirgei.retrofitauthorization.data.responses.LoginResponse
import com.tirgei.retrofitauthorization.data.responses.PostsResponse
import com.tirgei.retrofitauthorization.utils.Constants
import retrofit2.Call
import retrofit2.http.*

/**
 * Interface for defining REST request functions
 */
interface ApiService {

    @POST(Constants.LOGIN_URL)
    @FormUrlEncoded
    fun login(@Body request: LoginRequest): Call<LoginResponse>

    @GET(Constants.POSTS_URL)
    fun fetchPosts(): Call<PostsResponse>

}