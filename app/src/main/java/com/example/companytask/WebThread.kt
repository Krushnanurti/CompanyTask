package com.example.companytask

import android.os.AsyncTask

class WebThread: AsyncTask<Any?, Any?, UserResponse?>() {
    override fun doInBackground(vararg params: Any?): UserResponse? {
        return WebUtil.getUsers()
    }

    override fun onPostExecute(result: UserResponse?) {
        super.onPostExecute(result)
    }
}