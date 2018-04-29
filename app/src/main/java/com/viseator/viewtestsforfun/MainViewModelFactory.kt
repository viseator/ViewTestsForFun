package com.viseator.viewtestsforfun

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

/**
 * Created by wudi.viseator on 2018/4/29.
 * Wu Di
 * wudi.viseator@bytedance.com
 */

class MainViewModelFactory(private val numData: MutableLiveData<NumData>) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(numData) as T
        }
        throw IllegalStateException()
    }

}