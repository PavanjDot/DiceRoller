package com.example.diceroller

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Roll_btn : Button = findViewById(R.id.roll_button) as Button





        Roll_btn.setOnClickListener {

            Roll()

        }


    }

    fun Roll(){

        var image_view : ImageView = findViewById(R.id.image_dice)
        var text_result : TextView = findViewById(R.id.txt_result)
        val randomInt = (Random().nextInt(6) + 1)

// To show the Image and the Text
     when(randomInt){

         1 -> {image_view.setImageResource(R.drawable.dice_1)
                text_result.setText("1")
         }

         2 -> {image_view.setImageResource(R.drawable.dice_2)
                text_result.setText("2")
         }

         3 -> {image_view.setImageResource(R.drawable.dice_3)
                text_result.setText("3")
         }

         4 -> {image_view.setImageResource(R.drawable.dice_4)
                text_result.setText("4")
         }

         5 -> {image_view.setImageResource(R.drawable.dice_5)
             text_result.setText("5")
         }

         else -> {image_view.setImageResource(R.drawable.dice_6)
            text_result.setText("6")
         }

    }

        //To change Color

        when(randomInt){

            1 ->  text_result.setTextColor(Color.DKGRAY)

            2 -> text_result.setTextColor(Color.RED)

            3 -> text_result.setTextColor(Color.GRAY)

            4 -> text_result.setTextColor(Color.GREEN)

            5 -> text_result.setTextColor(Color.BLACK)

            else -> text_result.setTextColor(Color.CYAN)





        }

    }


}
