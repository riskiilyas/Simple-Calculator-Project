package com.keecoding.simplecalculatorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)

        val editTextAngka1 = findViewById<EditText>(R.id.editTextAngka1)
        val editTextAngka2 = findViewById<EditText>(R.id.editTextAngka2)
        val textViewOperasi = findViewById<TextView>(R.id.textOperasi)
        val buttonTambah = findViewById<Button>(R.id.buttonTambah)
        val buttonKurang = findViewById<Button>(R.id.buttonKurang)
        val buttonKali = findViewById<Button>(R.id.buttonKali)
        val buttonBagi = findViewById<Button>(R.id.buttonBagi)
        val buttonHasil = findViewById<Button>(R.id.buttonHasil)
        val textViewHasil = findViewById<TextView>(R.id.textHasil)

        buttonTambah.setOnClickListener {
            textViewOperasi.text = "+"
        }

        buttonKurang.setOnClickListener {
            textViewOperasi.text = "-"
        }

        buttonKali.setOnClickListener {
            textViewOperasi.text = "x"
        }

        buttonBagi.setOnClickListener {
            textViewOperasi.text = "/"
        }

        buttonHasil.setOnClickListener {
            if (editTextAngka1.text.toString().isBlank() || editTextAngka2.text.toString().isBlank()) {
                Toast.makeText(this, "Isi Dulu Inputnya!", Toast.LENGTH_SHORT).show()
            } else {
                when(textViewOperasi.text) {
                    "+" -> {
                        val hasil = editTextAngka1.text.toString().toFloat() + editTextAngka2.text.toString().toFloat()
                        textViewHasil.text = hasil.toString()
                    }
                    "-" -> {
                        val hasil = editTextAngka1.text.toString().toFloat() - editTextAngka2.text.toString().toFloat()
                        textViewHasil.text = hasil.toString()
                    }
                    "x" -> {
                        val hasil = editTextAngka1.text.toString().toFloat() * editTextAngka2.text.toString().toFloat()
                        textViewHasil.text = hasil.toString()
                    }
                    "/" -> {
                        val hasil = editTextAngka1.text.toString().toFloat() / editTextAngka2.text.toString().toFloat()
                        textViewHasil.text = hasil.toString()
                    }
                }
                Toast.makeText(this, textViewHasil.text.toString(), Toast.LENGTH_SHORT).show()
                textViewHasil.isVisible = true
            }
        }
    }
}