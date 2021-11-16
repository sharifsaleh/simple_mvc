package com.example.full_training.api

import com.example.full_training.model.User
import retrofit2.http.GET
import java.util.*

interface UserServiceApi {

    @GET("")
    fun getAllUser(): Observable<User>
}