package com.dicoding.submission.moviecatalogue.recyclerViewPackage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.TvShow
import com.squareup.picasso.Picasso


class TvListAdapter(private val tvShowsList: List<TvShow>, val listener: (TvShow) -> Unit)
    : RecyclerView.Adapter<TvListAdapter.TvShowItemViewHolder>(){

    //view holder is used to prevent findViewById calls
    inner class TvShowItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val poster = itemView.findViewById<ImageView>(R.id.tvShowPosterImgView)
        fun bind(tvShow: TvShow, listener: (TvShow) -> Unit) = with(itemView) {
            Picasso.get().load(tvShow.posterId)
                .centerCrop()
                .fit()
                .placeholder(R.drawable.ic_launcher_background)
                .into(poster)
            setOnClickListener { listener(tvShow) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TvShowItemViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.tvshowlist_row, viewGroup, false)
        return TvShowItemViewHolder(view)
    }

    override fun getItemCount(): Int = tvShowsList.size

    override fun onBindViewHolder(holder: TvShowItemViewHolder, position: Int) {
        holder.bind(tvShowsList[position], listener)
    }
}