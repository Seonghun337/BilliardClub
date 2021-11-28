package com.example.billiardclub

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.StyleSpan
import android.view.MenuItem
import com.example.billiardclub.databinding.ActivityLoginBinding
import com.google.android.material.snackbar.Snackbar


class LoginActivity : AppCompatActivity() {

    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // setting toolbar
        binding.toolbar.setTitle(R.string.title_login)
        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // setting text
//        binding.editTextID.addTextChangedListener{
//
//        }

        // setting login button
        binding.btnLogIn.setOnClickListener{
            Snackbar.make(binding.root, "test", Snackbar.LENGTH_SHORT).show()
        }

        // setting auto login

        // setting signUp
        val targetWord = "회원"
        val textSignUp = binding.txtSignUp.text
        val builder = SpannableStringBuilder(textSignUp)
        val strongSpan = StyleSpan(Typeface.BOLD)
        val colorSpan = StyleSpan(R.color.purple_500)
        val targetIdx = textSignUp.indexOf(targetWord)
        builder.setSpan(strongSpan, targetIdx, targetIdx+targetWord.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        builder.setSpan(colorSpan, targetIdx, targetIdx+targetWord.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.txtSignUp.text = builder

        binding.txtSignUp.setOnClickListener{
            //something to sign up
            Snackbar.make(binding.root, "hello", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, SignUpActivity01::class.java)
            startActivity(intent)
        }


    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.home -> {
                finish()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}