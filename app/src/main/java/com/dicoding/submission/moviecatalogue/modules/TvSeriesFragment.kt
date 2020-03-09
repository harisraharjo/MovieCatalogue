package com.dicoding.submission.moviecatalogue.modules

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.submission.moviecatalogue.DetailMovieActivity
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.TvShow
import com.dicoding.submission.moviecatalogue.recyclerViewPackage.TvListAdapter
import com.dicoding.submission.moviecatalogue.utility.DataUtil

class TvSeriesFragment : Fragment() {

    private lateinit var tvShowData: List<TvShow>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tvShowData = DataUtil.initTvShowsData()
        return inflater.inflate(R.layout.tv_series_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setuUpTvShowData(tvShowData,view)
    }

    private fun setuUpTvShowData(listTvShow: List<TvShow>, view: View){
        val rvTvSeries = view.findViewById<RecyclerView>(R.id.tvSeriesList_rv)
        val movieAdapter =
            TvListAdapter(
                listTvShow
            ){ tvShow ->
                val intent = Intent(context, DetailMovieActivity::class.java)
                intent.putExtra("tvData",tvShow)
                intent.putExtra("layout",1)
                startActivity(intent)
            }
        rvTvSeries.layoutManager = GridLayoutManager(context,2)
        rvTvSeries.setHasFixedSize(true);
        rvTvSeries.adapter = movieAdapter
    }

}
