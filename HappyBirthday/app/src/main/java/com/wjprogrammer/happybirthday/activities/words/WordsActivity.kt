package com.wjprogrammer.happybirthday.activities.words

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wjprogrammer.happybirthday.R
import com.wjprogrammer.happybirthday.activities.words.adapter.LetterAdapter
import com.wjprogrammer.happybirthday.databinding.ActivityWordsBinding

/**
 * Displays a RecyclerView of letters.
 */
class WordsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityWordsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        // Sets the LinearLayoutManager of the recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LetterAdapter()
    }
}