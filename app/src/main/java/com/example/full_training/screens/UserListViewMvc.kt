package com.example.full_training.screens

import com.example.full_training.common.views.ObservableViewMvc
import com.example.full_training.model.User

interface UserListViewMvc : ObservableViewMvc<UserListViewMvc.Listener> {

    interface Listener {
        fun onUserClicked(user: User)
    }

    abstract fun bindUser(user: List<User>)

    abstract fun showProgressIndication()

    abstract fun hideProgressIndication()
}
