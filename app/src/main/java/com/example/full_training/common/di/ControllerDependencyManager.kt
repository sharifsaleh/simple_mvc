package com.example.full_training.common.di

import androidx.fragment.app.FragmentActivity
import com.example.full_training.common.factory.ViewMvcFactory
import com.example.full_training.screens.FetchUserUseCase
import com.example.full_training.screens.UserListController

class ControllerDependencyManager(
    val mGlobalDependencyManager: GlobalDependencyManager,
    val mActivity: FragmentActivity
) {

    private fun getUserApi() = mGlobalDependencyManager.getUserApiInstance()

    fun getViewMvcFactory(): ViewMvcFactory = ViewMvcFactory(mActivity.layoutInflater)

    fun getUserListController(): UserListController = UserListController(getFetchUserUseCase())

    private fun getFetchUserUseCase() = FetchUserUseCase(getUserApi())
}