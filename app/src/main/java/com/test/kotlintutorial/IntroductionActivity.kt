package com.test.kotlintutorial

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_introduction.*

class IntroductionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
        setSupportActionBar(toolbar)

        val txtTopicIntro: TextView = findViewById(R.id.txtTopicIntro);
        txtTopicIntro.text = Html.fromHtml(getString(R.string.intro_topic))

        val btnkotlinproglang: Button = findViewById(R.id.btnkotlinproglang)
        btnkotlinproglang.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinproglang_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinproglang_label);
            this.startActivity(intent)
        })

        val btnkotlinforserverside: Button = findViewById(R.id.btnkotlinforserverside)
        btnkotlinforserverside.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinforserverside_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinforserverside_label);
            this.startActivity(intent)
        })

        val btnkotlinforandroid: Button = findViewById(R.id.btnkotlinforandroid)
        btnkotlinforandroid.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinforandroid_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinforandroid_label);
            this.startActivity(intent)
        })

        val btnkotlinforjavascript: Button = findViewById(R.id.btnkotlinforjavascript)
        btnkotlinforjavascript.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinforjavascript_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinforjavascript_label);
            this.startActivity(intent)
        })

        val btnkotlinpnewin11: Button = findViewById(R.id.btnkotlinpnewin11)
        btnkotlinpnewin11.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinpnewin11_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinpnewin11_label);
            this.startActivity(intent)
        })

        val btnkotlinbasicsytax: Button = findViewById(R.id.btnkotlinbasicsytax)
        btnkotlinbasicsytax.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinbasicsytax_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinbasicsytax_label);
            this.startActivity(intent)
        })

        val btnkotlinpidioms: Button = findViewById(R.id.btnkotlinpidioms)
        btnkotlinpidioms.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlinpidioms_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlinpidioms_label);
            this.startActivity(intent)
        })

        val btnkotlincodingconvention: Button = findViewById(R.id.btnkotlincodingconvention)
        btnkotlincodingconvention.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TopicActivity::class.java)
            intent.putExtra("topic_name", R.string.kotlincodingconvention_topic_content);
            intent.putExtra("toolbar_title", R.string.kotlincodingconvention_label);
            this.startActivity(intent)
        })

        val mToolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        val id = item.itemId

        if (id == R.id.action_settings) {
            showToastValidationMsg("No Setting Available!")
            return true
        }

        if (id == R.id.action_about_us) {
            // Start AboutUs activity here
            //setContentView(R.layout.aboutus);
            Log.d("About App", "Button clicked!")
            val intent = Intent(this, AboutAppActivity::class.java)
            this.startActivity(intent)
            return true
        }
        return super.onOptionsItemSelected(item)

        /*
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }*/
    }

    private fun showToastValidationMsg(s: String) {
        val toast = Toast.makeText(applicationContext, Html.fromHtml("<font color='green' ><b>"
                + s + "</b></font>"), Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

}
