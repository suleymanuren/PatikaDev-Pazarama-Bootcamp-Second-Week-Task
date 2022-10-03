package com.example.signupui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var etButon: Button

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etButon = findViewById(R.id.registerButton)
        etButon.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Login Page"
        val mStartActBtn = findViewById<Button>(R.id.startActBtn)
        //handle button click
        mStartActBtn.setOnClickListener {
            //start activity intent
            startActivity(Intent(this, SignupActivity::class.java))
        }







    }}