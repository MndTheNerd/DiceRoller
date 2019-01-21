package com.mndthenerd.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.text = "Lets Roll"
        roll_button.setOnClickListener {
            //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()

        }
    }

    private fun rollDice() {
        val RandomNum = java.util.Random().nextInt(6) +1
        val drawableResorces = when (RandomNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice_Image.setImageResource(drawableResorces)
    }

}
