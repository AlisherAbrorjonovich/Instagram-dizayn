package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.databinding.ItemReelsBinding
import com.example.instagram.databinding.ItemStoryBinding

class ReelsAdapter(var list : ArrayList<Int>): RecyclerView.Adapter<ReelsAdapter.Vh>() {
    inner class Vh( var itemReelsBinding: ItemReelsBinding): RecyclerView.ViewHolder(itemReelsBinding.root) {

        fun onBind(user: Int){
            itemReelsBinding.reelsImg.setImageResource(user)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemReelsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}