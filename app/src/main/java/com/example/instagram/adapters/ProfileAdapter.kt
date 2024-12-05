package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.databinding.ItemProfileBinding

class ProfileAdapter(var list : ArrayList<Int>): RecyclerView.Adapter<ProfileAdapter.Vh>() {
    inner class Vh( var itemProfileBinding: ItemProfileBinding): RecyclerView.ViewHolder(itemProfileBinding.root) {

        fun onBind(user: Int){
            itemProfileBinding.img1.setImageResource(user)
            itemProfileBinding.img2.setImageResource(user)
            itemProfileBinding.img3.setImageResource(user)
            itemProfileBinding.img4.setImageResource(user)
            itemProfileBinding.img5.setImageResource(user)
            itemProfileBinding.img6.setImageResource(user)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemProfileBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}