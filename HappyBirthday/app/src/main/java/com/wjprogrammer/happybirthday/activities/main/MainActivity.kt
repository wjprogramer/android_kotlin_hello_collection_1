package com.wjprogrammer.happybirthday.activities.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wjprogrammer.happybirthday.activities.diceRoller.DiceRollerActivity
import com.wjprogrammer.happybirthday.R

const val EXTRA_MESSAGE = "com.wj.happy.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goDiceRoller(view: View) {
        val message = "val editText = findViewById<EditText>(R.id.editText)"
        val intent = Intent(this, DiceRollerActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}