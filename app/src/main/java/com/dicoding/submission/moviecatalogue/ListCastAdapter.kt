package com.dicoding.submission.moviecatalogue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.moviecatalogue.model.Cast
import com.squareup.picasso.Picasso

class ListCastAdapter(private val listCast: List<Cast>): RecyclerView.Adapter<ListCastAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cast_realname = itemView.findViewById<TextView>(R.id.cast_realname)
        var cast_moviename = itemView.findViewById<TextView>(R.id.cast_moviename)
        var photo = itemView.findViewById<ImageView>(R.id.castDetail_imageVIew)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.cast_row, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCast.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val cast = listCast[position]
        Picasso.get().load(cast.img)
            .centerCrop()
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.photo)

        holder.cast_realname.text = cast.realname
        holder.cast_moviename.text = cast.moviename
    }


}