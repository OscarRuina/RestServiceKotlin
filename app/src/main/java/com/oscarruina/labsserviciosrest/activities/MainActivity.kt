package com.oscarruina.labsserviciosrest.activities

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.oscarruina.labsserviciosrest.R
import com.oscarruina.labsserviciosrest.configurations.RetrofitClient
import com.oscarruina.labsserviciosrest.dtos.Post
import com.oscarruina.labsserviciosrest.endpoints.MyApi
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var tvServicioRest : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = RetrofitClient.retrofit.create(MyApi::class.java)

        val callPost = api.getPost()

        callPost.enqueue(object : retrofit2.Callback<List<Post>>
        {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                val post = response.body()
                if (post != null){
                    tvServicioRest = findViewById(R.id.tvServicioRest)
                    tvServicioRest.text = post.toString()
                    Log.d("Respuesta", post.toString())
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Log.e("ERROR" , t.message?:"")
            }
        })



    }
}
