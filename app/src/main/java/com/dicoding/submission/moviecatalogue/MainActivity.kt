package com.dicoding.submission.moviecatalogue

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val movieData = MovieUtil.initMoviesData()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_main);
        toolbar.title = ("Movies List")
        setSupportActionBar(toolbar)

        val customListAdapter = MovieListAdapter(this,movieData)
        listView.adapter = customListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val intent = Intent(baseContext, DetailMovieActivity::class.java)
            if (itemAtPos is Movie) {
                intent.putExtra("movieData", itemAtPos)
                startActivity(intent)
            }
        }
    }
}
