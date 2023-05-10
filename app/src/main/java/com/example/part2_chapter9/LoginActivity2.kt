package com.example.part2_chapter9

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.part2_chapter9.databinding.ActivityLoginBinding
import com.kakao.sdk.auth.model.OAuthToken

class LoginActivity2: AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var callback: (OAuthToken?, Throwable?) -> Unit = {token, error ->
        if (error != null) {
            Log.e("loginActivity", "error $error")
            error.printStackTrace()
        } else if (token != null){
            Log.e("loginActivity", )
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}