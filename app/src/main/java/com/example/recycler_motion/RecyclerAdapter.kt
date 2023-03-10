package com.example.recycler_motion

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(val context: Context, val ArrayLlist: MutableList<String>): RecyclerView.Adapter<RecyclerAdapter.myViewHolder>() {

    private var lastPosition = -1

    class myViewHolder( val itemview:View ):RecyclerView.ViewHolder(itemview){
        val cardview: CardView = itemView.findViewById(R.id.cardview1)
        val textview: TextView = itemView.findViewById(R.id.tv1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return myViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ArrayLlist.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
          var data = ArrayLlist.get(position)
          holder.textview.text = data
         holder.cardview.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.transition)
    }

    /*private fun setAnimation(viewToAnimate: View, position: Int) {
        if (position > lastPosition) {
            val animation: Animation =
                AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left)
            viewToAnimate.startAnimation(animation)
            lastPosition = position
        }
    }*/


}