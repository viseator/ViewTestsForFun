package com.viseator.viewtestsforfun

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private val handler = Handler()
    private val numObserver = Observer<NumData> { t: NumData? -> text.text = t!!.count.toString() }
    private val classObserver = Observer<SomeClass> {
        t -> t?.doSomething()
        Log.d("vir", "observer")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, MainViewModelFactory(DataProvider().provide())).get(
                MainViewModel::class.java)
        viewModel.numData.observe(this, numObserver)
        text.text = viewModel.numData.value!!.count.toString()
        button.setOnClickListener {
            val num = viewModel.numData.value
            num!!.count++
            viewModel.numData.value = num
        }
        init_button.setOnClickListener {
            viewModel.someClass = MutableLiveData()
            viewModel.someClass.value = SomeClass()
            viewModel.someClass.observe(this, classObserver)
        }
        start.setOnClickListener {
            handler.postDelayed({
                viewModel.someClass.value = viewModel.someClass.value
            }, 2000)
        }
    }

    override fun onPause() {
        super.onPause()
        viewModel.someClass.value = null
    }
}
