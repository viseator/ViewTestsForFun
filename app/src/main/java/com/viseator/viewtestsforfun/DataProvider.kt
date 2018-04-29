package com.viseator.viewtestsforfun

/**
 * Created by wudi.viseator on 2018/4/29.
 * Wu Di
 * wudi.viseator@bytedance.com
 */
class DataProvider : IDataProvider<NumData> {
    private val numData = NumData()
    override fun provide(): NumData {
        return numData
    }

}