package com.example.navigationandmvvm.ViewsAndViewModels.Page2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.navigationandmvvm.databinding.ActivityPage2Binding

class Page2View : AppCompatActivity() {
    private val TAG = Page2View::class.java.simpleName
    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_Page2)

        Log.i(TAG, "onCreate from Page2View")

        // create binding
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val text: TextView = binding.countTxt
        val incrementBtn = binding.incrementBtn
        val goBackBtn = binding.goBackBtn

        val viewModel = ViewModelProvider(this).get(Page2ViewModel::class.java)
        lifecycle.addObserver(viewModel)
        viewModel.count.observe(this) {
            text.text = "Count: ${it}"
        }

        incrementBtn.setOnClickListener {
            viewModel.increment()
        }
        goBackBtn.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume from Page2View")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause from Page2View")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy from Page2View")
    }
}