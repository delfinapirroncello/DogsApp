package com.example.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.doglist.databinding.ItemDogsBinding
import com.squareup.picasso.Picasso

class DogsViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogsBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}