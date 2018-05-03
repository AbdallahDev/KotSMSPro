package com.example.user.kotsmspro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var manager=SmsManager.getDefault()
            manager.sendTextMessage(editText.text.toString(),
                    null,editText2.text.toString(),
                    null,null)

        }
    }
}
