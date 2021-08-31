package one.innovation.digital.applicationbmi.layouttypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main_constraint_layout.*
import one.innovation.digital.applicationbmi.R

class MainConstraintLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint_layout)
        setListeners()
    }

    private fun setListeners(){
        editTextWeight?.doAfterTextChanged {
            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
        }
        editTextHeight?.doAfterTextChanged { textViewBMI.text = it }
        button.setOnClickListener { bmiCalculate(editTextWeight.text.toString(), editTextHeight.text.toString()) }

    }

    private fun bmiCalculate(weight: String, height: String){
        val weight = weight.toFloatOrNull()
        val height = height.toFloatOrNull()
        if(weight != null && height != null){
            val bmi = weight / (height * height)
            textViewBMI.text = "Your BMI is\n%.2f".format(bmi)
        }
        else {textViewBMI.text = "Please fill all fields"}
    }
}