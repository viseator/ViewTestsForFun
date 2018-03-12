package com.viseator.viewtestsforfun

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by wudi.viseator on 2018/3/12.
 * Wu Di
 * wudi.viseator@bytedance.com
 */
class SharedElementTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_element_test)
        title = "SharedElementTestActivity"
    }
}