package com.example.full_training.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.full_training.common.fragment.BaseFragment

class UserListFragment : BaseFragment() {

    lateinit var mViewMvc: UserListViewMvc
    lateinit var mController: UserListController

    companion object {
        fun getInstance() = UserListFragment()

        fun getName() = "FRAGMENT_LIST"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        mController.onStart()
    }

    override fun onStop() {
        super.onStop()
        mController.onStop()
        mViewMvc.unregisterListener(activity as UserListViewMvc.Listener)
    }
}
