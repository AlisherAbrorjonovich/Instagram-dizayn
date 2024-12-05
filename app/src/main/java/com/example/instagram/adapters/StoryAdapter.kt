package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.databinding.ItemStoryBinding


class StoryAdapter(var list : ArrayList<Int>): RecyclerView.Adapter<StoryAdapter.Vh>() {
    inner class Vh( var itemStoryBinding: ItemStoryBinding): RecyclerView.ViewHolder(itemStoryBinding.root) {

        fun onBind(user: Int){
            itemStoryBinding.imgStory.setImageResource(user)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemStoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}