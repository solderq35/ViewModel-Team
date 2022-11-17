package com.example.navigationandmvvm.ViewsAndViewModels.Page2

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Page2ViewModel : ViewModel(), DefaultLifecycleObserver {
    private val TAG = Page2ViewModel::class.java.simpleName

    val count = MutableLiveData<Int>().apply { value = 0 }

    fun increment() {
        count.value = count.value?.plus(1)
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(TAG, "onCreate from Page2ViewModel")
        count.value = -1
    }
}