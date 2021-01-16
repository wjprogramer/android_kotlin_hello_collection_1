package com.wjprogrammer.happybirthday.activities.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.wjprogrammer.happybirthday.R
import com.wjprogrammer.happybirthday.activities.affirmations.adapter.ItemAdapter
import com.wjprogrammer.happybirthday.activities.affirmations.data.DataSource

class AffirmationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmations)

        // Initialize data.
        val myDataSet = DataSource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}