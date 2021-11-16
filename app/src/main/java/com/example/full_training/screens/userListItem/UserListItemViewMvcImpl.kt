package com.example.full_training.screens.userListItem

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.full_training.R
import com.example.full_training.common.views.BaseObservableViewMvc
import com.example.full_training.model.User

class UserListItemViewMvcImpl(layoutInflater: LayoutInflater, parent: ViewGroup?) :
    BaseObservableViewMvc<UserListItemViewMvc.Listener>(),
    UserListItemViewMvc {

        private lateinit var user: User

        init {
            setRootView(layoutInflater.inflate(R.layout.user_list_item, parent, false))
            getRootView().setOnClickListener {
                getListener().forEach { listener ->
                    listener.onUserItemClick(user)
                }
            }
        }

        override fun bindMovie(user: User) {
        }
}