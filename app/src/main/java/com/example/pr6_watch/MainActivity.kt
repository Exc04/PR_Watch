package com.example.pr6_watch

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.chatBlock).setOnClickListener {
            startActivity(Intent(this, ChatListActivity::class.java))
        }

        findViewById<View>(R.id.folderBlock).setOnClickListener {
            startActivity(Intent(this, MoviesActivity::class.java))
        }

        findViewById<View>(R.id.heartBlock).setOnClickListener {
            startActivity(Intent(this, FavoritesActivity::class.java))
        }
    }
}
