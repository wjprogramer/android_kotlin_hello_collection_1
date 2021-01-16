package com.wjprogrammer.happybirthday.activities.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wjprogrammer.happybirthday.R
import com.wjprogrammer.happybirthday.activities.affirmations.AffirmationsActivity
import com.wjprogrammer.happybirthday.activities.diceRoller.DiceRollerActivity
import com.wjprogrammer.happybirthday.activities.themes.ThemeActivity
import com.wjprogrammer.happybirthday.activities.tipTime.TipTimeActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val diceRollerButton: Button = findViewById(R.id.button_dice_roller)
        diceRollerButton.setOnClickListener {
            val intent = Intent(this, DiceRollerActivity::class.java)
            startActivity(intent)
        }

        val tipTimeButton: Button = findViewById(R.id.button_tip_time)
        tipTimeButton.setOnClickListener {
            val intent = Intent(this, TipTimeActivity::class.java)
            startActivity(intent)
        }

        val themeButton: Button = findViewById(R.id.button_theme)
        themeButton.setOnClickListener {
            val intent = Intent(this, ThemeActivity::class.java)
            startActivity(intent)
        }

        val affirmationButton: Button = findViewById(R.id.button_affirmations)
        affirmationButton.setOnClickListener {
            val intent = Intent(this, AffirmationsActivity::class.java)
            startActivity(intent)
        }
    }

}