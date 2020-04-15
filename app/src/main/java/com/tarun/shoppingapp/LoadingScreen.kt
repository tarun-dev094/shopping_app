package com.tarun.shoppingapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class LoadingScreen: Activity() {
    lateinit var welcomeMessageView:TextView
    var welcomeMessage=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_screen)
        welcomeMessage=resources.getString(R.string.loadingMessage)
        identifierViews()
    }
    fun identifierViews(){
        welcomeMessageView=findViewById(R.id.textMessage)
        welcomeMessageView.text=welcomeMessage

    }

}