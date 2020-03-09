package com.dicoding.submission.moviecatalogue.modules

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.moviecatalogue.DetailMovieActivity
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.Movie
import com.dicoding.submission.moviecatalogue.recyclerViewPackage.MovieListAdapter
import com.dicoding.submission.moviecatalogue.utility.DataUtil


class MoviesFragment : Fragment() {

    private lateinit var movieData: List<Movie>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        movieData = DataUtil.initMoviesData()
        return inflater.inflate(R.layout.movies_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMovieRecyclerView(movieData,view)
    }

    private fun setupMovieRecyclerView(listMovie: List<Movie>,view: View){
        val rvMovie = view.findViewById<RecyclerView>(R.id.movieList_rv)
        val movieAdapter =
            MovieListAdapter(
                listMovie
            ){ movie ->
                val intent = Intent(context, DetailMovieActivity::class.java)
                intent.putExtra("movieData",movie)
                intent.putExtra("layout",0)
                startActivity(intent)
            }
        rvMovie.layoutManager = GridLayoutManager(context,2)
        rvMovie.adapter = movieAdapter
    }
}
