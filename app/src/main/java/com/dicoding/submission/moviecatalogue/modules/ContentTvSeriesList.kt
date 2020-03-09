package com.dicoding.submission.moviecatalogue.modules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.dicoding.submission.moviecatalogue.R

class ContentTvSeriesList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.content_tvseries_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbar_main)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.content_tv_series_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfig = AppBarConfiguration(navController.graph)
        toolbar?.setupWithNavController(navController,appBarConfig)
    }

}
