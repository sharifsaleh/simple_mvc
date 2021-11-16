package com.example.full_training.common.views

abstract class BaseObservableViewMvc<ListenerType> : BaseViewMvc(), ObservableViewMvc<ListenerType> {

    private var listenerList = arrayListOf<ListenerType>()

    override fun registerListener(listener: ListenerType) {
        listenerList.add(listener)
    }

    override fun unregisterListener(listener: ListenerType) {
        listenerList.remove(listener)
    }

    protected fun getListener() = listenerList as List<ListenerType>
}
