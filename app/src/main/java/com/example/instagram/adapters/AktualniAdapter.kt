package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.databinding.ItemAktualniBinding

class AktualniAdapter(var list : ArrayList<Int>): RecyclerView.Adapter<AktualniAdapter.Vh>() {
    inner class Vh( var itemAktualniBinding: ItemAktualniBinding): RecyclerView.ViewHolder(itemAktualniBinding.root) {

        fun onBind(user: Int){
            itemAktualniBinding.imgAktualni.setImageResource(user)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemAktualniBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}