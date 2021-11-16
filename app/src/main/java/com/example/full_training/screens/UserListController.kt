package com.example.full_training.screens

import android.widget.Toast
import com.example.full_training.model.User

class UserListController(
    private var fetchUserUseCase: FetchUserUseCase
) : UserListViewMvc.Listener, FetchUserUseCase.Listener {

    override fun onUserFetched(user: List<User>) {
        mViewMvc.hideProgressIndication()
        mViewMvc.bindUser(user)
    }

    override fun onUserFetchedFailed() {
        Toast.makeText(mViewMvc.getRootView().context, "ERRO AO CARREGAR FILMES", Toast.LENGTH_SHORT).show()
    }

    override fun onUserClicked(user: User) {
        Toast.makeText(mViewMvc.getRootView().context, user.name, Toast.LENGTH_SHORT).show()
    }

    lateinit var mViewMvc: UserListViewMvc

    fun bindView(view: UserListViewMvc) {
        mViewMvc = view
    }

    fun onStart() {
        mViewMvc.registerListener(this)
        fetchUserUseCase.registerListener(this)
        fetchUserUseCase.fetchUserAndNotify()
    }

    fun onStop() {
        mViewMvc.unregisterListener(this)
        fetchUserUseCase.unregisterListener(this)
    }
}
