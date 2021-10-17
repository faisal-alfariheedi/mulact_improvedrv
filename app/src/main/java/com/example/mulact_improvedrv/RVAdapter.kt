package com.example.mulact_improvedrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mulact_improvedrv.databinding.RvlistBinding

class RVAdapter(var s:ArrayList<person>): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: RvlistBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            RvlistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val rv = s[position]
        holder.binding.apply {
            cardtitle.text = "name: ${rv.name}"
            carddesc.text = "location: ${rv.location}"
            cat.text = "mobile: ${rv.mobile}"
            date.text = "email: ${rv.email}"
        }
    }
    override fun getItemCount() = s.size
}