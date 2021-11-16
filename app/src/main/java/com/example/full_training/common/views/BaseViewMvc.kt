package com.example.full_training.common.views

import android.view.View

abstract class BaseViewMvc : ViewMvc {

    private lateinit var mRootView: View

    override fun getRootView(): View {
        return mRootView
    }

    protected fun setRootView(view: View) {
        mRootView = view
    }

    protected fun getContext() = mRootView.context
}