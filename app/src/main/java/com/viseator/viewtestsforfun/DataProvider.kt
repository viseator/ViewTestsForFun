package com.viseator.viewtestsforfun

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

/**
 * Created by wudi.viseator on 2018/4/29.
 * Wu Di
 * wudi.viseator@bytedance.com
 */
class DataProvider : IDataProvider<MutableLiveData<NumData>> {
    private val numData = MutableLiveData<NumData>()
    override fun provide(): MutableLiveData<NumData> {
        numData.value = NumData()
        return numData
    }

}