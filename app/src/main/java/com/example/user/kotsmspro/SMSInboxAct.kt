package com.example.user.kotsmspro

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_smsinbox.*

class SMSInboxAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smsinbox)

        var list=ArrayList<String>()

        var u=Uri.parse("content://sms//inbox")
        var fields= arrayOf("address","body")
        var cur=contentResolver.query(u,fields,null,null,null)

        cur.moveToFirst()
        while(cur.isAfterLast==false)
        {
            list.add(cur.getString(0) + "\n"+cur.getString(1))
            cur.moveToNext()
        }

        var adp=ArrayAdapter(this,
                android.R.layout.simple_list_item_1,list)
        lv.adapter=adp

    }
}
