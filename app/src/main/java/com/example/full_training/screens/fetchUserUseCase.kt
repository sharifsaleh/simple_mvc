package com.example.full_training.screens

import com.example.full_training.api.UserServiceApi
import com.example.full_training.common.views.BaseObservableViewMvc
import com.example.full_training.model.User

class FetchUserUseCase(var userServiceApi: UserServiceApi) : BaseObservableViewMvc<FetchUserUseCase.Listener>() {

    interface Listener {
        fun onUserFetched(user: List<User>)
        fun onUserFetchedFailed()
    }

    fun fetchUserAndNotify() {
        var user = arrayListOf<User>()
        userServiceApi.getAllUser()
    }
}
