package com.dicoding.submission.moviecatalogue

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import android.util.TypedValue
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.Toolbar
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlin.math.roundToInt

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_detail)
        val movieDetails = intent.getParcelableExtra<Movie>("movieData")

        if (movieDetails != null){
            Picasso.get().load(movieDetails.posterId)
                .centerCrop()
                .fit()
                .placeholder(R.drawable.ic_launcher_background)
                .into(poster_detail)

            generateGenreText(movieDetails.genres)

            toolbar.title = movieDetails.title.toUpperCase()
            rating_detail.text = "${movieDetails.rating}%"
            rating_detail.setBackgroundColor(getColor(R.color.greenMbulak))
            runtime_detail.text = movieDetails.runtime
            synopsis_detail.text = movieDetails.desc
            synopsis_detail.justificationMode = JUSTIFICATION_MODE_INTER_WORD
            yearDetail_txtView.text = movieDetails.releaseDate
            director_txtView.text = movieDetails.director

            setupCastRecyclerView(movieDetails.cast)

        }

        setSupportActionBar(toolbar)

        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun generateGenreText(genres: List<String>){
        val linearLayoutGenre = findViewById<LinearLayout>(R.id.linearLayoutGenre_detailMovie)
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT)
        params.marginEnd = 8

        var backColId: Int
        var textColId: Int

        for (genre in genres){
            val genreText = TextView(this)
            genreText.text = genre.toUpperCase()
            linearLayoutGenre.addView(genreText)
            genreText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            genreText.setPadding(4,4,4,4)
            genreText.layoutParams = params

            val getCol = getGenreColor(genre)
            when (getCol) {
                "red" -> {
                    backColId = R.color.redMbulak
                    textColId = R.color.easyRed
                }
                "blue" -> {
                    backColId = R.color.blueMbulak
                    textColId = R.color.easyBlue
                }
                else -> {
                    backColId = R.color.greenMbulak
                    textColId = R.color.easyGreen
                }
            }
            genreText.setBackgroundColor(getColor(backColId))
            genreText.setTextColor(getColor(textColId))
        }
    }

    private fun getGenreColor(genre: String): String{
        val tGenre = genre.toUpperCase()
        var color = when (tGenre){
            "SCI-FI","CRIME", "FANTASY" -> "blue"
            "DRAMA", "COMEDY",  "FAMILY", "ANIMATION" -> "green"
            else -> "red"
        }
        return color
    }

    private fun setupCastRecyclerView(listCast: List<Cast>){
        val rvCast = findViewById<RecyclerView>(R.id.castDetail_recyclerView)
        val castAdapter = ListCastAdapter(listCast)
        rvCast.adapter = castAdapter
        rvCast.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
    }
}
