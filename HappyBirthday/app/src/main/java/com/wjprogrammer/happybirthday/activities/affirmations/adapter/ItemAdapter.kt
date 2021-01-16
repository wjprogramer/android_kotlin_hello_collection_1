package com.wjprogrammer.happybirthday.activities.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wjprogrammer.happybirthday.R
import com.wjprogrammer.happybirthday.activities.affirmations.model.Affirmation
import com.wjprogrammer.happybirthday.activities.affirmations.AffirmationsActivity

/**
 * Adapter for the [RecyclerView] in [AffirmationsActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views
     * (invoked by the layout manager when there are no existing view holders that can be reused)
     *
     * @param parent is the RecyclerView
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_affirmation, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view
     * (invoked by the layout manager in order to replace the contents of a list item view.)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataSet.size
}
