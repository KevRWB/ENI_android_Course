package com.example.mod12api

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.Moshi
import okhttp3.*
import java.io.IOException

private const val TAG = "MainACtivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clientOKHTTP = OkHttpClient()
        val request = Request.Builder()
            .url("https://api.punkapi.com/v2/beers")
            .build()
        clientOKHTTP.newCall(request).enqueue(object : Callback{

            override fun onFailure(call: Call, e: IOException) {
                Log.e(TAG, "onFailure" + e.message)
            }

            override fun onResponse(call: Call, response: Response) {
                Log.i(TAG, "onResponse : ${response.body?.string()}")
                if(response.isSuccessful){
                    val adapter = Moshi.Builder().build()

                }
            }

        })
    }
}