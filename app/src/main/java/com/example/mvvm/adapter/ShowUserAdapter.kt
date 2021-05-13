package com.example.mvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm.databinding.ItemRecyclerBinding
import com.example.mvvm.model.UsersModel

class ShowUserAdapter(val dates: MutableList<UsersModel>) :
    RecyclerView.Adapter<ShowUserAdapter.ViewHolderShowUser>() {

    inner class ViewHolderShowUser(private val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(date: UsersModel) {
            binding.name = date.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderShowUser =
        ViewHolderShowUser(
            ItemRecyclerBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )

    override fun onBindViewHolder(holder: ViewHolderShowUser, position: Int) =
        holder.setData(
            dates[position]
        )

    override fun getItemCount(): Int = dates.size

}