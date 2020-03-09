package com.dicoding.submission.moviecatalogue.views

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.modules.MoviesFragment
import com.dicoding.submission.moviecatalogue.modules.TvSeriesFragment

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager ) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitles = arrayOf(
        mContext.resources.getString(R.string.tab_text_1),
        mContext.resources.getString(R.string.tab_text_2)
    )

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> MoviesFragment()
            1 -> TvSeriesFragment()
            else -> throw RuntimeException("Invalid tab position")
        }
    }

    override fun getCount(): Int {
        return tabTitles.size
    }
}