package com.dicoding.submission.moviecatalogue

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dicoding.submission.moviecatalogue.modules.SettingsFragment
import com.dicoding.submission.moviecatalogue.sliderAdapterPackage.SliderAdapter
import com.dicoding.submission.moviecatalogue.views.ViewPagerAdapter
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        initSliderView()

        val viewPagerAdapter = ViewPagerAdapter(this, supportFragmentManager)
        viewpager.adapter = viewPagerAdapter
        tabs.setupWithViewPager(viewpager)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow,menu)
        return true
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
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initSliderView(){
        val sliderView = findViewById<SliderView>(R.id.imageSlider)
        val mSliderAdapter = SliderAdapter(this)
        sliderView.setSliderAdapter(mSliderAdapter)
        sliderView.setIndicatorAnimation(IndicatorAnimations.SCALE_DOWN)
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION)
        sliderView.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_RIGHT
        sliderView.indicatorSelectedColor = Color.WHITE
        sliderView.indicatorUnselectedColor = Color.GRAY
        sliderView.scrollTimeInSec =  4
        sliderView.startAutoCycle()
    }
}
