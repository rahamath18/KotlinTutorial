package com.test.kotlintutorial

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_about_app.*
import android.text.Html
import android.widget.TextView
import android.view.Gravity
import android.view.View
import android.widget.Toast
import android.support.v7.widget.Toolbar;

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)
        setSupportActionBar(toolbar)

        val toast = Toast.makeText(applicationContext, Html.fromHtml("<font color='green' ><b>"
                + "Welcome to About App section" + "</b></font>"), Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()

        val txtViewAboutApp: TextView = findViewById<TextView>(R.id.txtViewAboutApp)
        txtViewAboutApp.setText(Html.fromHtml(getString(R.string.about_app_section)))

        val mToolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

}