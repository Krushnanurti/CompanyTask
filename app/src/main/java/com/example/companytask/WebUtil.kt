package com.example.companytask

import com.google.gson.Gson
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class WebUtil {
    //Here we are creating companion object which gives only one instance of the class
    companion object{
        //On calling of this method we will get ArrayList<User> From the Api
        fun getUsers():UserResponse{
            var userApiURL=URL("https://dummyjson.com/users")
            var httpsURLConnection=userApiURL.openConnection() as HttpsURLConnection
            httpsURLConnection.requestMethod="GET"
            httpsURLConnection.connect()

            var apiReader=InputStreamReader(httpsURLConnection.inputStream)
            var gson:Gson= Gson()
            var userResponse=gson.fromJson<UserResponse>(apiReader,UserResponse::class.java)
            return userResponse
        }
    }
}