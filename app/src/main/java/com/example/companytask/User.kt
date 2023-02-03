package com.example.companytask

import com.google.gson.annotations.SerializedName
import java.util.Objects

class User(
    @SerializedName("firstName")
    var firstName:String,
    @SerializedName("lastName")
    var lastName:String,
    @SerializedName("age")
    var age:Int,
    @SerializedName("address")
    var address:Object,
    @SerializedName("lat")
    var lat:Float,
    @SerializedName("lng")
    var lng:Float
)