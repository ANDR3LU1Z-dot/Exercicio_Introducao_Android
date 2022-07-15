package com.example.exerciciointroducaoandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat

class MainActivity : AppCompatActivity() {

    var editText : AppCompatEditText? = null
    var tela : LinearLayoutCompat? = null

    var numCount = 0

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val textTitle = findViewById<AppCompatTextView>(R.id.title)
        editText = findViewById(R.id.input_text)
        tela = findViewById(R.id.tela)
        val tvNumCounts = findViewById<AppCompatTextView>(R.id.numCounts)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val name = editText!!.text.toString()
            if(name != ""){
                textTitle.setText(name)
                changeBackground()
                numCount++
                tvNumCounts.setText(numCount.toString())
            } else{
                Toast.makeText(this,"Digite seu nome",Toast.LENGTH_SHORT).show()
            }


        }



    }

    private fun changeBackground() {
        when{
            numCount % 2 == 0 -> tela?.background = getDrawable(R.drawable.b4638aa66c9882cbb725d1adf0fed6b0)
            else -> tela?.background = getDrawable(R.drawable.retrowave_hd_wall_prxmjom)
        }
    }
}