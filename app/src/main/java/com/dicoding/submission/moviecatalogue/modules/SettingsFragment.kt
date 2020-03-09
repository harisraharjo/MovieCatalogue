package com.dicoding.submission.moviecatalogue.modules

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.dicoding.submission.moviecatalogue.R
import kotlinx.android.synthetic.main.fragment_settings.*
import java.util.*


class SettingsFragment : DialogFragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var  setFullScreen = false
        if (arguments != null) {
            setFullScreen = requireNotNull(arguments?.getBoolean("fullScreen"))
        }
        if (setFullScreen) setStyle(DialogFragment.STYLE_NORMAL, R.style.FullscreenDialogTheme)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        if (arguments != null)
        {
            if (arguments?.getBoolean("notAlertDialog")!!)
            {
                return super.onCreateDialog(savedInstanceState)
            }
        }
        val builder = AlertDialog.Builder(context!!)
        builder.setTitle("Alert Dialog")
        builder.setMessage("Hello! I am Alert Dialog")
        builder.setPositiveButton("OK"
        ) { dialog, which -> dismiss() }
        builder.setNegativeButton("Cancel"
        ) { dialog, which -> dismiss() }
        return builder.create()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }
    override fun onViewCreated(view:View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fullscreen_dialog_close.setOnClickListener(this)
        onRadioButtonClicked(view)
    }

    fun onRadioButtonClicked(view: View) {
        val radioGroup = view.findViewById<RadioGroup>(R.id.radiogroup_language)
        val languagename = Locale.getDefault().displayLanguage

        if (languagename == "Indonesia") radioGroup.check(R.id.rb_ind)
        else radioGroup.check(R.id.rb_english)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.rb_english -> {
                    val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
                    startActivity(mIntent)
                }
                R.id.rb_ind ->{
                    val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
                    startActivity(mIntent)
                }
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.fullscreen_dialog_close -> dismiss()
        }
    }

//    interface DialogListener {
//        fun onFinishEditDialog(inputText:String)
//    }

}
