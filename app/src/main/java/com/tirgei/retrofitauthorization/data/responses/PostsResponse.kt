package com.tirgei.retrofitauthorization.data.responses

import com.google.gson.annotations.SerializedName
import com.tirgei.retrofitauthorization.data.models.Post

data class PostsResponse (
    @SerializedName("status_code")
    var status: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("posts")
    var posts: List<Post>
)