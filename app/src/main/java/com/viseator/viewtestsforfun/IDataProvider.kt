package com.viseator.viewtestsforfun

/**
 * Created by wudi.viseator on 2018/4/29.
 * Wu Di
 * wudi.viseator@bytedance.com
 */
interface IDataProvider<T> {
    fun provide(): T
}