package com.hw16.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.boredapi.com"

object RetrofitServices {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val getApi: GetApi = retrofit.create(GetApi::class.java)
}

interface GetApi {
    @GET("/api/activity/")
    suspend fun getData(): UsefulActivityDto
}