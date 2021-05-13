package com.example.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvm.R
import com.example.mvvm.adapter.ShowUserAdapter
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.model.UsersModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    val dates : MutableList<UsersModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Cast()
        setListDates()
        binding.recyMainActivityShowListUser.adapter = ShowUserAdapter(dates)

    }

    private fun Cast(){

        // Recycler view at layout mainActivity for show list user
        // set layoutManager as LinearLayoutManager
        binding.recyMainActivityShowListUser.layoutManager = LinearLayoutManager(this)


    }

    private fun setListDates(){
        for (item in 18..28){
            dates.add(
                UsersModel(
                    "Name$item",
                    "Family$item",
                    item
                )
            )
        }
    }

}