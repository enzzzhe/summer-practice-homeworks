package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val nameOfUser = findViewById<TextView>(R.id.name_field).text.toString()
    val ageOfUser = findViewById<TextView>(R.id.age_field).text.toString()
    val heightOfUser = findViewById<TextView>(R.id.height_field).text.toString()
    val weightOfUser = findViewById<TextView>(R.id.weight_field).text.toString()
    val button: Button = findViewById<Button>(R.id.button_field)

    fun checking(
        name: String, height: Int, weight: Double, age: Int
    ): Boolean{
        val result = ((name.length != 0) && (name.length <= 50) && (0< height) && (height <= 250) && (weight > 0) && (weight <= 150) && (age > 0) && (age < 150))
        return result
    }

    fun Calories(
        name: String, height: Int, weight: Double, age: Int
    ): Button {
        if (checking(name, height, weight, age)) {
            val value = name.length * (height - age) * weight
            this.button.setOnClickListener(){
                val answer = findViewById<TextView>(R.id.Answer)
                answer.text = value.toString()
            }
        } else {
            this.button.setOnClickListener() {
                val answer = findViewById<TextView>(R.id.Answer)
                answer.text = "Данные введены некорректно"
            }


        }
        return button
    }
    fun main(view: View) {

        var heightOfUser1 = heightOfUser.toInt()
        var weightOfUser1 = weightOfUser.toDouble()
        var ageOfUser1 = ageOfUser.toInt()

        Calories(nameOfUser, heightOfUser1, weightOfUser1, ageOfUser1)


    }



}


