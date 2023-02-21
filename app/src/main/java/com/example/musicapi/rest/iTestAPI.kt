package com.example.musicapi.rest

import com.example.musicapi.models.UserResponse
import retrofit2.Response
import retrofit2.http.GET

interface iTestAPI {
    @GET(SEARCH)
    suspend fun getUsers(): Response<UserResponse>


    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
        private const val SEARCH = "todos/1"
    }
}