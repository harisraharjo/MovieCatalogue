package com.dicoding.submission.moviecatalogue.recyclerViewPackage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.Movie
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation

class MovieListAdapter(private val moviesList: List<Movie>, val listener: (Movie) -> Unit)
    : RecyclerView.Adapter<MovieListAdapter.MovieItemViewHolder>()
{

    //view holder is used to prevent findViewById calls
    inner class MovieItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val poster = itemView.findViewById<ImageView>(R.id.moviePosterImgView)
        fun bind(movie: Movie, listener: (Movie) -> Unit) = with(itemView) {
            Picasso.get().load(movie.posterId)
                .centerCrop()
                .fit()
                .placeholder(R.drawable.ic_launcher_background)
                .into(poster)
            setOnClickListener { listener(movie) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieItemViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.movielist_row, viewGroup, false)
        return MovieItemViewHolder(view)
    }

    override fun getItemCount(): Int = moviesList.size

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(moviesList[position], listener)
    }
}