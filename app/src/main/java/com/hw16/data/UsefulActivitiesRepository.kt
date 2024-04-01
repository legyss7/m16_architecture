package com.hw16.data

import javax.inject.Inject

class UsefulActivitiesRepository @Inject constructor() {
    suspend fun getUsefulActivity(): UsefulActivityDto {
        return RetrofitServices.getApi.getData()
    }
}