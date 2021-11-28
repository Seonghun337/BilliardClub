package com.example.billiardclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.billiardclub.databinding.ActivitySignUp01Binding

class SignUpActivity01 : AppCompatActivity() {

    val binding by lazy{ ActivitySignUp01Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.toolbarSignup.setTitle(R.string.title_signup)
        setSupportActionBar(binding.toolbarSignup)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        binding.btnNext.setOnClickListener{
            //something to sign up
            val intent = Intent(this, SignUpActivity02::class.java)
            startActivity(intent)
        }
    }
}