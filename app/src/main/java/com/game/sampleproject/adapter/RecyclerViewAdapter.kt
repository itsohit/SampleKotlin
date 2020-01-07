package com.status.a2zstatus.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.game.sampleproject.R
import com.status.a2zstatus.adapter.RecyclerViewAdapter.MyHolder
import com.status.a2zstatus.model.ImageItems
import kotlinx.android.synthetic.main.item_layout.view.*

class RecyclerViewAdapter(val list: ArrayList<ImageItems>,val context:Context):
    RecyclerView.Adapter<MyHolder>() {


    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview = itemView.tv;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
         val v = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return MyHolder(v);
    }

    override fun getItemCount(): Int {
          return list.size;
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
    //    Glide.with(context).load(""+list.get(position).url).into(holder.imageview)
    }
}