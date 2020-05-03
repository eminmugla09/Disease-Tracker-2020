package com.mugla.diseasetracker

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//this function when you click the name it shows contents
class ListOnlineViewHolder(view:View):RecyclerView.ViewHolder(view),View.OnClickListener{

    val txtEmail:TextView=view.findViewById(R.id.txtEmail)
    val llContent:LinearLayout=view.findViewById(R.id.LLContent)
    lateinit var itemClickListener: ItemClickListener

    fun SetItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickListener=itemClickListener
    }

    override fun onClick(v: View) {
        itemClickListener.onClick(v,adapterPosition)
    }
}

