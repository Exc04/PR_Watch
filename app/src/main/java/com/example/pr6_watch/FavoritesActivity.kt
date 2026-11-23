package com.example.pr6_watch

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FavoritesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        val container = findViewById<LinearLayout>(R.id.favoritesContainer)

        // В избранном просто показываем три фильма из каталога.
        val movies = MoviesCatalog.all.take(3)

        for (movie in movies) {
            val item = layoutInflater.inflate(R.layout.item_movie, container, false)
            item.findViewById<ImageView>(R.id.moviePoster).setImageResource(movie.poster)
            item.findViewById<TextView>(R.id.movieTitle).text = movie.title
            container.addView(item)
        }

        findViewById<View>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}
