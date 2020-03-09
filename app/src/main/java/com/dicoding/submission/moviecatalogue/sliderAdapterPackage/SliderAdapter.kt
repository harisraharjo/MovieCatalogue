package com.dicoding.submission.moviecatalogue.sliderAdapterPackage

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.dicoding.submission.moviecatalogue.R
import com.smarteist.autoimageslider.SliderViewAdapter
import com.squareup.picasso.Picasso


class SliderAdapter(context: Context) :
    SliderViewAdapter<SliderAdapter.SliderAdapterVH>() {
    private val context: Context
    private var mSliderItems: MutableList<Int> = arrayListOf(
        R.drawable.poster_joker,
        R.drawable.poster_sonic,
        R.drawable.poster_frozen,
        R.drawable.poster_onward,
        R.drawable.poster_knivesout
    )
    fun renewItems(sliderItems: MutableList<Int>) {
        mSliderItems = sliderItems
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        mSliderItems.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItem(sliderItem: Int) {
        mSliderItems.add(sliderItem)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val inflate: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_slider_layout_item, null)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(
        viewHolder: SliderAdapterVH,
        position: Int
    ) {
        val sliderItem: Int = mSliderItems[position]
        Picasso.get().load(sliderItem)
            .centerInside()
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .into(viewHolder.imageViewBackground)
    }

    override fun getCount(): Int {
        return mSliderItems.size
    }

    inner class SliderAdapterVH(itemView: View) :
        ViewHolder(itemView) {
        var theView: View
        var imageViewBackground: ImageView

        init {
            imageViewBackground = itemView.findViewById(R.id.backdrop_main)
            this.theView = itemView
        }
    }

    init {
        this.context = context
    }
}