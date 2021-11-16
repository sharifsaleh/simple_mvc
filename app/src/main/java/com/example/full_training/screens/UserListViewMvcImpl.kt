package com.example.full_training.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.full_training.R
import com.example.full_training.common.factory.ViewMvcFactory
import com.example.full_training.common.views.BaseObservableViewMvc
import com.example.full_training.model.User

class UserListViewMvcImpl(
    layoutInflater: LayoutInflater,
    parent: ViewGroup?,
    viewMvcFactory: ViewMvcFactory
) : BaseObservableViewMvc<UserListViewMvc.Listener>(),
    UserListViewMvc,
    UserListAdapter.Listener{

    var mAdapter = UserListAdapter(this, viewMvcFactory)

    override fun onUserItemClicked(user: User) {
        getListener().forEach {
                listener -> listener.onUserClicked(user)
        }
    }

    init {
        setRootView(layoutInflater.inflate(R.layout.user_list_fragment, parent, false))
        getRootView().rv_user_list.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
        }

    }

    override fun bindUser(user: List<User>) {
        mAdapter.bindMovies(user)
    }

    override fun showProgressIndication() {
        getRootView().progress_bar.visibility = View.VISIBLE
    }

    override fun hideProgressIndication() {
        getRootView().progress_bar.visibility = View.INVISIBLE
    }
}