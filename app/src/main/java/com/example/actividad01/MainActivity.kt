package com.example.actividad01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var texto : TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.boton)
        texto = findViewById(R.id.texto)
        var contador = 0
        button.setOnClickListener {
            contador++
            when(contador){
                1 -> texto.text = "uno"
                2 -> texto.text = "dos"
                3,4,5 -> texto.text = "$contador"
                6,7,8,9 -> texto.text = "Le estas dando mucho..."
            }
            if (contador > 10){
                button.isEnabled = false
                val toast = Toast.makeText(this,"Le has dado demasiadas veces",Toast.LENGTH_SHORT)
                toast.show()

            }
        }

    }
}