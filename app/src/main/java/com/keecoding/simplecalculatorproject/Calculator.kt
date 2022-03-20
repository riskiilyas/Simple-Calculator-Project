package com.keecoding.simplecalculatorproject

import android.widget.EditText

class Calculator(
    private val editTextAngka1: EditText,
    private val editTextAngka2: EditText
) {

    fun calculate(operator: String): Float {
        var hasil = 0F
        when (operator) {
            "+" -> {
                hasil = editTextAngka1.text.toString()
                    .toFloat() + editTextAngka2.text.toString().toFloat()
            }
            "-" -> {
                hasil = editTextAngka1.text.toString()
                    .toFloat() - editTextAngka2.text.toString().toFloat()
            }
            "x" -> {
                hasil = editTextAngka1.text.toString()
                    .toFloat() * editTextAngka2.text.toString().toFloat()
            }
            "/" -> {
                hasil = editTextAngka1.text.toString()
                    .toFloat() / editTextAngka2.text.toString().toFloat()
            }
        }
        return hasil
    }
}