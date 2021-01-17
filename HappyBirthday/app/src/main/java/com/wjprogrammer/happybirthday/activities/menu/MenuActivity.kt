package com.wjprogrammer.happybirthday.activities.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wjprogrammer.happybirthday.R
import com.wjprogrammer.happybirthday.activities.affirmations.AffirmationsActivity
import com.wjprogrammer.happybirthday.activities.dessert_clicker.DessertClickerActivity
import com.wjprogrammer.happybirthday.activities.diceRoller.DiceRollerActivity
import com.wjprogrammer.happybirthday.activities.themes.ThemeActivity
import com.wjprogrammer.happybirthday.activities.tipTime.TipTimeActivity
import com.wjprogrammer.happybirthday.activities.words.WordsActivity
import com.wjprogrammer.happybirthday.activities.words2.Words2Activity

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

        val wordsButton: Button = findViewById(R.id.button_words)
        wordsButton.setOnClickListener {
            val intent = Intent(this, WordsActivity::class.java)
            startActivity(intent)
        }

        val wordsButton2: Button = findViewById(R.id.button_words2)
        wordsButton2.setOnClickListener {
            val intent = Intent(this, Words2Activity::class.java)
            startActivity(intent)
        }

        val dessertClickerButton: Button = findViewById(R.id.button_dessert_clicker)
        dessertClickerButton.setOnClickListener {
            val intent = Intent(this, DessertClickerActivity::class.java)
            startActivity(intent)
        }
    }

}