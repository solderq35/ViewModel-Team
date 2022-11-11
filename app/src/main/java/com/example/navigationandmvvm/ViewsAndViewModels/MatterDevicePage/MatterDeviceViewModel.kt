package com.example.navigationandmvvm.ViewsAndViewModels.MatterDevicePage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MatterDeviceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Matter Device page fragment"
    }
    val text: LiveData<String> = _text

}