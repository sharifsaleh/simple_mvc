package com.example.full_training.screens.userListItem

import com.example.full_training.common.views.ObservableViewMvc
import com.example.full_training.model.User

interface UserListItemViewMvc : ObservableViewMvc<UserListItemViewMvc.Listener> {

    interface Listener {
        fun onUserItemClick(user: User)
    }

    fun bindMovie(user: User)
}
