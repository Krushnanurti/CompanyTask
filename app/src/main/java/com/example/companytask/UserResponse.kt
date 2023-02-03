package com.example.companytask

import com.google.gson.annotations.SerializedName

class UserResponse(
    @SerializedName("users")
    var users:ArrayList<User>
) {
}