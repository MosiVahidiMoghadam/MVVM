package com.example.mvvm.view

import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvm.R
import com.example.mvvm.adapter.ShowUserAdapter
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.model.LifecycleModel
import com.example.mvvm.model.UsersModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val dates : MutableList<UsersModel> = mutableListOf()
    private lateinit var lifecycle : LifecycleModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        castView()
        setListDates()
        binding.recyMainActivityShowListUser.adapter = ShowUserAdapter(dates)

    }

    private fun castView(){

        // Recycler view at layout mainActivity for show list user
        // set layoutManager as LinearLayoutManager
        binding.recyMainActivityShowListUser.layoutManager = LinearLayoutManager(this)
        lifecycle = LifecycleModel()
        lifecycle.onCreate()


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

    override fun onDestroy() {
        lifecycle.onDestroy()
        super.onDestroy()
    }

}