package com.example.billiardclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.billiardclub.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 2500

    val binding by lazy { ActivitySplashBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler().postDelayed({
                              startActivity(Intent(this,LoginActivity::class.java))
        }, SPLASH_TIME_OUT)
    }
}