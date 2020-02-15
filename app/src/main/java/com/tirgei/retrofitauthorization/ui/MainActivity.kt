package com.tirgei.retrofitauthorization.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tirgei.retrofitauthorization.R
import com.tirgei.retrofitauthorization.data.ApiClient
import com.tirgei.retrofitauthorization.data.responses.PostsResponse
import com.tirgei.retrofitauthorization.utils.SessionManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var apiClient: ApiClient
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiClient = ApiClient()
        sessionManager = SessionManager(this)
    }

    /**
     * Function to fetch posts
     */
    private fun fetchPosts() {
        apiClient.getApiService(this).fetchPosts()
            .enqueue(object : Callback<PostsResponse> {
                override fun onFailure(call: Call<PostsResponse>, t: Throwable) {
                    // Error fetching posts
                }

                override fun onResponse(call: Call<PostsResponse>, response: Response<PostsResponse>) {
                    // Handle function to display posts
                }
            })
    }
}
