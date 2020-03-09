package com.dicoding.submission.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import android.util.TypedValue
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.moviecatalogue.model.Cast
import com.dicoding.submission.moviecatalogue.model.Movie
import com.dicoding.submission.moviecatalogue.model.TvShow
import com.dicoding.submission.moviecatalogue.modules.SettingsFragment
import com.dicoding.submission.moviecatalogue.recyclerViewPackage.CastListAdapter
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlinx.android.synthetic.main.activity_detail_tvseries.*

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent.extras
        val layoutIntent = intent?.getInt("layout")
        val layout = when (layoutIntent){
            0 -> R.layout.activity_detail_movie
            else -> R.layout.activity_detail_tvseries
        }

        setContentView(layout)

        when(layoutIntent){
            0 -> {
                toolbar = findViewById(R.id.toolbar_detail)
                populateMovieDetailLayout(intent.getParcelable("movieData")!!)
            }
            else -> {
                toolbar = findViewById(R.id.toolbar_detail_tv)
                populateTvDetailLayout(intent!!.getParcelable("tvData")!!)
            }
        }

        setSupportActionBar(toolbar)
        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_settings -> {
                val dialogFragment = SettingsFragment()
                val bundle = Bundle()
                bundle.putBoolean("fullScreen", true)
                bundle.putBoolean("notAlertDialog", true)
                dialogFragment.arguments = bundle
                val ft = supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_to_right, R.anim.enter_from_right ,R.anim.exit_to_left)
                val prev = supportFragmentManager.findFragmentByTag("dialog")
                if (prev != null) {
                    ft.remove(prev)
                }
                ft.addToBackStack(null)
                dialogFragment.show(ft, "dialog")
            }
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun populateMovieDetailLayout(data: Movie){
        Picasso.get().load(data.posterId)
            .centerCrop()
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(poster_detail)

        generateGenreText(data.genres)


        toolbar.title = data.title.toUpperCase()
        rating_detail.text = "${data.rating}%"
        rating_detail.setBackgroundColor(getColor(R.color.greenMbulak))
        runtime_detail.text = data.runtime
        synopsis_detail.text = data.desc
        synopsis_detail.justificationMode = JUSTIFICATION_MODE_INTER_WORD
        year_detail.text = data.releaseDate
        director_detail.text = data.director

        setupCastRecyclerView(data.cast)
    }

    private fun populateTvDetailLayout(data: TvShow){
        Picasso.get().load(data.posterId)
            .centerCrop()
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(poster_detail_tv)

        Picasso.get().load(data.network)
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(network_detail_tv)

        generateGenreText(data.genres,false)


        toolbar.title = data.title.toUpperCase()
        rating_detail_tv.text = "${data.rating}%"
        rating_detail_tv.setBackgroundColor(getColor(R.color.greenMbulak))
        runtime_detail_tv.text = data.runtime
        currentSeasonDetail_tv.text =  "${resources.getString(R.string.season)} ${data.lastSeason}"
        currentSeasonYearEpisodesDetail_tv.text = "${data.lastSeasonYear} | ${data.lastSeasonEpisode} Episodes"
        synopsis_detail_tv.text = data.desc
        synopsis_detail_tv.justificationMode = JUSTIFICATION_MODE_INTER_WORD
        year_detail_tv.text = data.releaseDate
        creator_detail.text = data.creator

        setupCastRecyclerView(data.cast, false)
    }

    private fun generateGenreText(genres: List<String>, isMovie: Boolean = true){
        val linearLayoutGenre: LinearLayout = when (isMovie){
            true -> findViewById(R.id.linearLayoutGenre_detailMovie)
            else -> findViewById(R.id.linearLayoutGenre_detail_tv)
        }

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

            when (getGenreColor(genre)) {
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
        return when (genre.toUpperCase()){
            "SCI-FI","CRIME", "FANTASY" -> "blue"
            "DRAMA", "COMEDY",  "FAMILY", "ANIMATION" -> "green"
            else -> "red"
        }
    }

    private fun setupCastRecyclerView(listCast: List<Cast>, isMovie: Boolean = true){
        val rvCast: RecyclerView = when (isMovie){
            true -> findViewById(R.id.castDetail_recyclerView)
            else -> findViewById(R.id.castDetail_tv_recyclerView)
        }

        val castAdapter =
            CastListAdapter(
                listCast
            )
        rvCast.adapter = castAdapter
        rvCast.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
    }
}
