package com.example.apka_zaliczenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.TextView

class wynikActivity1 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wynik1)

        val message=intent.getStringExtra(EXTRA_MESSAGE)


        val textView=findViewById<TextView>(R.id.wynikid).apply{
                text= message
            }

    }


}