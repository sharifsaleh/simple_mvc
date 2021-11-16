package com.example.full_training.common.main

import android.view.LayoutInflater
import com.example.full_training.R
import com.example.full_training.common.fragment.FragmentFrameHelper
import com.example.full_training.common.views.BaseViewMvc

class MainViewMvcImpl(layoutInflater: LayoutInflater) : BaseViewMvc(), MainViewMvc {

    override fun getFragmentWrapper() = getRootView()

    override fun getFragmentHelper(): FragmentFrameHelper {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    init {
        setRootView(layoutInflater.inflate(R.layout.activity_main, null, false))
    }
}
