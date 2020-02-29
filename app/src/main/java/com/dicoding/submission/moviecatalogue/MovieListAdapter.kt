package com.dicoding.submission.moviecatalogue

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToInt

class MovieListAdapter(private val context: Activity,private val movies: ArrayList<Movie>)
    : ArrayAdapter<Movie>(context, R.layout.listview_row, movies)
{

    //view holder is used to prevent findViewById calls
    private class MovieItemViewHolder {
        internal var image: ImageView? = null
        internal var title: TextView? = null
        internal var duration: TextView? = null
        internal var year: TextView? = null
        internal var genre: TextView? = null
        internal var rating: TextView? = null
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var rowView: View? = convertView
        val viewHolder: MovieItemViewHolder
        val movie = movies[position]

        if (rowView == null){
            val inflater = context.layoutInflater
            rowView = inflater.inflate(R.layout.listview_row, parent, false)

            viewHolder = MovieItemViewHolder()
            viewHolder.title = rowView.findViewById<TextView>(R.id.movieTitle_txtView)
            viewHolder.duration = rowView.findViewById<TextView>(R.id.duration_txtView)
            viewHolder.year = rowView.findViewById<TextView>(R.id.year_txtView)
            viewHolder.genre = rowView.findViewById<TextView>(R.id.genre_txtView)
            viewHolder.rating = rowView.findViewById<TextView>(R.id.rating_txtView)
            viewHolder.image = rowView.findViewById<ImageView>(R.id.moviePosterImgView)

        }else{
            //no need to call findViewById, can use existing ones from saved view holder
            viewHolder = rowView.tag as MovieItemViewHolder
        }

        viewHolder.title?.text = movie.title.toUpperCase(Locale.ENGLISH)
        viewHolder.duration?.text = movie.runtime
        viewHolder.year?.text = movie.releaseDate
        viewHolder.genre?.text = movie.genres.joinToString(separator = " | ")
        viewHolder.rating?.text = "${movie.rating}%"

        Picasso.get().load(movie.posterId)
            .transform(RoundedCornersTransformation(35, 0))
            .centerCrop()
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(viewHolder.image)

        rowView!!.tag = viewHolder
        return rowView
    }
}