package com.tirgei.retrofitauthorization.data.responses

import com.google.gson.annotations.SerializedName
import com.tirgei.retrofitauthorization.data.models.User

data class LoginResponse (
    @SerializedName("status_code")
    var statusCode: Int,

    @SerializedName("auth_token")
    var authToken: String,

    @SerializedName("user")
    var user: User?
)