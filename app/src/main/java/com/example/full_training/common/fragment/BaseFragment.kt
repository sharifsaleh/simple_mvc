package com.example.full_training.common.fragment

import androidx.fragment.app.Fragment
import com.example.full_training.common.AppApplication
import com.example.full_training.common.di.ControllerDependencyManager

abstract class BaseFragment : Fragment() {

    private var mControllerDependencyManager: ControllerDependencyManager? = null

    fun getControllerDependencyManager(): ControllerDependencyManager {
        return mControllerDependencyManager
            ?: ControllerDependencyManager((activity?.application as AppApplication).getGlobalDependencyManager(), requireActivity())
                .also { mControllerDependencyManager = it }
    }
}
