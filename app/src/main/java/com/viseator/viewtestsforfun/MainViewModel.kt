package com.viseator.viewtestsforfun

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by wudi.viseator on 2018/4/29.
 * Wu Di
 * wudi.viseator@bytedance.com
 */

class MainViewModel(val numData: MutableLiveData<NumData>) : ViewModel() {
    lateinit var someClass: MutableLiveData<SomeClass>
}