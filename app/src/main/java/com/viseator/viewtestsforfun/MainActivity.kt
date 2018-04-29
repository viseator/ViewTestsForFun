package com.viseator.viewtestsforfun

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UiCallback {

    private val presenter = MainPresenter(DataProvider(), this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { presenter.increaseNum() }
        init_button.setOnClickListener { presenter.initSomeClass(SomeClass()) }
    }

    override fun updateNum(num: Int) {
        text.text = num.toString()
    }

}
