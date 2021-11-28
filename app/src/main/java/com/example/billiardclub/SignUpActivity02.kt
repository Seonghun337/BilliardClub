package com.example.billiardclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.billiardclub.databinding.ActivitySignUp01Binding
import com.example.billiardclub.databinding.ActivitySignUp02Binding

class SignUpActivity02 : AppCompatActivity() {

    val binding by lazy{ ActivitySignUp02Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.toolbarSignup2.setTitle(R.string.title_signup2)
        setSupportActionBar(binding.toolbarSignup2)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


    }
}