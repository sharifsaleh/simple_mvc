package com.example.full_training.common.factory

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.full_training.screens.UserListViewMvcImpl
import com.example.full_training.screens.userListItem.UserListItemViewMvc
import com.example.full_training.screens.userListItem.UserListItemViewMvcImpl

class ViewMvcFactory(private val layoutInflater: LayoutInflater) {

    fun getUserListViewMvc(parent: ViewGroup?) = UserListViewMvcImpl(layoutInflater, parent, this)

    fun getUserListItemViewMvc(parent: ViewGroup?): UserListItemViewMvc = UserListItemViewMvcImpl(
        layoutInflater, parent
    )
}
