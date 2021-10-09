package com.example.myapplicationcalculadoragorjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Button
import androidx.core.content.res.ComplexColorCompat.inflate

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{calculateTip()}

        // Old way with findViewById()
        val myButton: Button = findViewById(R.id.my_button)
        myButton.text = "A button"

        val cost = stringInTextField.toDouble()

// Better way with view binding
        val myButton: Button = binding.myButton
        myButton.text = "A button"

// Best way with view binding and no extra variable
        binding.myButton.text = "A button"

    }
    private fun calculateTip(){
        val stringInTextField = binding.constOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val selectedld = binding.tipOptions.checkedRadioButtonld
        val tipPercentage = when (selectedId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
            var tip = tipPercentage * cost
            var roundUp = binding.roundUpSwitch.isChecked
            if (roundUp) {
                tip = kotlin.math.ceil(tip)
            }

        }
    }
}

private fun Any.setOnClickListener(function: () -> Unit) {

}

class ActivityMainBinding {

    val calculateButton: Any
    val myButton: Any
    val root: Int = 0
}
