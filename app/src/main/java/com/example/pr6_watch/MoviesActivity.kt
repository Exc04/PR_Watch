package com.example.pr6_watch

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoviesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val container = findViewById<LinearLayout>(R.id.moviesContainer)

        for (movie in MoviesCatalog.all) {
            val item = layoutInflater.inflate(R.layout.item_movie_card, container, false)

            item.findViewById<ImageView>(R.id.moviePoster).setImageResource(movie.poster)
            item.findViewById<TextView>(R.id.movieTitle).text = movie.title

            container.addView(item)
        }

        findViewById<View>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}
