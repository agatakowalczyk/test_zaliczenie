 package com.example.apka_zaliczenie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


 class MainActivity : AppCompatActivity() {

     private var oblicz: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        oblicz = findViewById(R.id.obliczid)


        oblicz?.setOnClickListener {
            val intent= Intent(this,wynikActivity1::class.java )
            startActivity(intent)


        }
    }

     fun clickButton1() { //funkcja, która jest wywołana po naciśnięciu przycisku


         val wzrost=findViewById<TextView>(R.id.wzrostid)
         val userInput=wzrost.text.toString() //szczytujemy wartość wpisaną przez użytkownika

         val waga=findViewById<TextView>(R.id.wagaid)
         val userInput2=waga.text.toString() //szczytujemy wartość wpisaną przez użytkownika


         val answer = compute(userInput.toDouble(), userInput2.toDouble() )
         val output = findViewById<TextView>(R.id.wynikid )
         val message = output.setText(answer.toString())



     }


     fun compute (x:Double, y:Double):Double{
         return x/(y)*(y)
     }
}