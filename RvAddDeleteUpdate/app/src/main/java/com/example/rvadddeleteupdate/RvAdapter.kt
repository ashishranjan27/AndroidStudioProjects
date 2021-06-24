package com.example.rvadddeleteupdate

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.rvadddeleteupdate.RvAdapter.RvViewHolder
import java.util.*

class RvAdapter//        this.onclick = onclick; // Onclick onclick
(var context: Context, var models: ArrayList<Model>) : RecyclerView.Adapter<RvViewHolder>() {
    var onclick: Onclick? = null

    interface Onclick {
        fun onEvent(model: Model?, pos: Int)
    }

    var view: View? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        //LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // view = inflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return RvViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val model = models[position]
        if (model.getName() != null) {
            holder.itemName.text = model.getName()
        }
        holder.removeImg.setOnClickListener {
            models.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }

    inner class RvViewHolder(itemView: View) : ViewHolder(itemView) {
        var itemName: TextView
        var removeImg: ImageView
        var llItem: LinearLayout? = null

        init {
            itemName = itemView.findViewById(R.id.tv_name)
            removeImg = itemView.findViewById(R.id.img_remove)
        }
    }

}