package com.example.mvvm.model

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifecycleModel : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.i("TAG_TEST", "onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.i("TAG_TEST","onDestroy")
    }
}