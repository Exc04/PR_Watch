package com.example.pr6_watch

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())

    private val openSignIn = Runnable {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.postDelayed(openSignIn, 3000)
    }

    override fun onDestroy() {
        handler.removeCallbacks(openSignIn)
        super.onDestroy()
    }
}
