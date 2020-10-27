package com.louishaub.scalecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun calculate(view: View) {
        var output = etInputNumber.text.toString().toDouble()
        val scaleIn = etInputScale.text.toString().toDouble()
        val scaleOut = etOutputScale.text.toString().toDouble()

        output *= scaleIn
        output /= scaleOut

        tvOutputNumber.text = output.toString()
    }
}