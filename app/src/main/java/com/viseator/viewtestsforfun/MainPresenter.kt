package com.viseator.viewtestsforfun

/**
 * Created by wudi.viseator on 2018/4/29.
 * Wu Di
 * wudi.viseator@bytedance.com
 */
class MainPresenter() {
    private lateinit var dataProvider: DataProvider
    private lateinit var uiCallback: UiCallback
    private lateinit var someClass: SomeClass

    constructor(dataProvider: DataProvider, uiCallback: UiCallback) : this() {
        this.dataProvider = dataProvider
        this.uiCallback = uiCallback
    }

    fun increaseNum() {
        dataProvider.provide().count = dataProvider.provide().count + 1
        someClass.doSomething()
        uiCallback.updateNum(dataProvider.provide().count)
    }

    fun initSomeClass(someClass: SomeClass) {
        this.someClass = someClass
    }


}