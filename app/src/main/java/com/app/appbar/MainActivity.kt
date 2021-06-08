package com.app.appbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the toolbar as support action bar
        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.apply {
            // Set toolbar title/app title
            title = "Toolbar Title"

            // Set action bar/toolbar sub title
            subtitle = "Toolbar sub title"

            // Display the app icon in action bar/toolbar
            setDisplayShowHomeEnabled(true)
            setLogo(R.mipmap.ic_launcher)
            setDisplayUseLogoEnabled(true)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        val textView : TextView = findViewById(R.id.textView)
        when (item.itemId) {
            R.id.action_cut -> {
                textView.text = "Cut Clicked."
                return true
            }
            R.id.action_copy -> {
                textView.text = "Copy Clicked."
                return true
            }
            R.id.action_paste -> {
                textView.text = "Paste Clicked."
                return true
            }
            R.id.action_new -> {
                textView.text = "New Clicked."
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}