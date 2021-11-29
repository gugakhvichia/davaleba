package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var Button1: Button
    lateinit var Button2: Button
    lateinit var Button3: Button
    lateinit var Button4: Button
    lateinit var Button5: Button
    lateinit var Button6: Button
    lateinit var Button7: Button
    lateinit var Button8: Button
    lateinit var Button9: Button

    var firstplayer = ArrayList<Int>()
    var secondplayer = ArrayList<Int>()
    var activePlayer=1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button1 = findViewById(R.id.button1)
        Button2 = findViewById(R.id.button2)
        Button3 = findViewById(R.id.button3)
        Button4 = findViewById(R.id.button4)
        Button5 = findViewById(R.id.button5)
        Button6 = findViewById(R.id.button6)
        Button7 = findViewById(R.id.button7)
        Button8 = findViewById(R.id.button8)
        Button9 = findViewById(R.id.button9)


        Button1.setOnClickListener(this)
        Button2.setOnClickListener(this)
        Button3.setOnClickListener(this)
        Button4.setOnClickListener(this)
        Button5.setOnClickListener(this)
        Button6.setOnClickListener(this)
        Button7.setOnClickListener(this)
        Button8.setOnClickListener(this)
        Button9.setOnClickListener(this)


    }

    override fun onClick(clickedview: View?) {

        if (clickedview is Button) {
            var buttonNumber = 0
            when (clickedview.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 1
                R.id.button3 -> buttonNumber = 1
                R.id.button4 -> buttonNumber = 1
                R.id.button5 -> buttonNumber = 1
                R.id.button6 -> buttonNumber = 1
                R.id.button7 -> buttonNumber = 1
                R.id.button8 -> buttonNumber = 1
                R.id.button9 -> buttonNumber = 1
            }
           if (buttonNumber!=0){
               playGame(clickedview,buttonNumber)
           }
        }


    }
fun playGame(view: Button,buttonNumber : Int){
    var activePlayer = 1
    if (activePlayer==1) {
        view.text="X"
        view.setBackgroundColor(Color.RED)
        firstplayer.add(buttonNumber)
        activePlayer=2

    }
else{
    view.text="0"
        view.setBackgroundColor(Color.RED)
        secondplayer.add(buttonNumber)
        activePlayer=1



    }
view.isEnabled=false
    check()

}
fun check() {
    var winner = 0
    if (firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)) {
        winner = 1
    }
    if (secondplayer.contains(1) && secondplayer.contains(2) && secondplayer.contains(3)) {
        winner = 2
    }
    if (firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)) {
        winner = 1
    }
    if (firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)) {
        winner = 2
    }
    if (firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)) {
        winner = 1
    }
    if (firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)) {
        winner = 2
    }
    if (firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {
        winner = 1
    }
    if (firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {
        winner = 2
    }
    if (firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)) {
        winner = 1
    }
    if (firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(6)) {
        winner = 2
    }
    if (firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {
        winner = 1
    }
    if (firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {
        winner = 1
    }
    if (firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)) {
        winner = 1
    }
    if (firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)) {
        winner = 2
    }
    if (firstplayer.contains(3) && firstplayer.contains(5) && firstplayer.contains(7)) {
        winner = 1
    }
    if (firstplayer.contains(3) && firstplayer.contains(5) && firstplayer.contains(7)) {
        winner = 2
    }

    if (winner == 1) {
        Toast.makeText(this, "winner is 1", Toast.LENGTH_SHORT).show()

    } else if (winner == 2) {
        Toast.makeText(this, "Winner is 2", Toast.LENGTH_SHORT).show()
    }
}

}
