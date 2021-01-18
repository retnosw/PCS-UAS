package com.github.githubuserapi.api

import com.github.githubuserapi.data.model.DetailUserResponse
import com.github.githubuserapi.data.model.User
import com.github.githubuserapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 1ad4572191240a9ee9ff5f770767fa0b5508bbdf")
    fun getSearchUser(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 1ad4572191240a9ee9ff5f770767fa0b5508bbdf")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 1ad4572191240a9ee9ff5f770767fa0b5508bbdf")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 1ad4572191240a9ee9ff5f770767fa0b5508bbdf")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}