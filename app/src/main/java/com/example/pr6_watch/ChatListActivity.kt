package com.example.pr6_watch

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ChatListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)

        findViewById<View>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}
