package Adapters

import Models.Os
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.gridviewhomework.R
import kotlinx.android.synthetic.main.item_grid.view.*

class MyAdapters(context: Context, val list: ArrayList<Os>) : BaseAdapter() {
    override fun getCount(): Int = 8

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView: View
        if (convertView == null) {
            itemView =
                LayoutInflater.from(parent?.context).inflate(R.layout.item_grid, parent, false)
        } else {
            itemView = convertView
        }

        itemView.txt_grid.text = list[position].name
        itemView.image_grid.setImageResource(list[position].pic!!)

        return itemView
    }
}