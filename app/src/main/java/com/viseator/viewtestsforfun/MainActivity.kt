package com.viseator.viewtestsforfun

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, MainViewModelFactory(DataProvider().provide())).get(
                MainViewModel::class.java)
        text.text = viewModel.numData.count.toString()
        button.setOnClickListener {
            text.text = (++viewModel.numData.count).toString()
            viewModel.someClass.doSomething()
        }
        init_button.setOnClickListener {
            viewModel.someClass = SomeClass()
        }

    }
}
