package com.example.full_training.common.di

import com.example.full_training.BASE_URL
import com.example.full_training.api.UserServiceApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class GlobalDependencyManager {

    var userApiInstance: UserServiceApi? = null

    @JvmName("getUserApiInstance1")
    fun getUserApiInstance(): UserServiceApi {
        return userApiInstance ?: Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(UserServiceApi::class.java).also { userApiInstance = it }
    }
}
