package com.viseator.viewtestsforfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val itemList = listOf("shared element transitions", "test")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = MainListAdapter(this)
        adapter.items = itemList
        main_recyclerview.adapter = adapter
        main_recyclerview.layoutManager = LinearLayoutManager(this)
    }
}
