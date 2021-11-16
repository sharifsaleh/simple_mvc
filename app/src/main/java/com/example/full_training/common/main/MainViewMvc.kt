package com.example.full_training.common.main

import android.view.View
import com.example.full_training.common.fragment.FragmentFrameHelper
import com.example.full_training.common.views.ViewMvc

interface MainViewMvc : ViewMvc {

    fun getFragmentWrapper(): View

    fun getFragmentHelper(): FragmentFrameHelper
}
