package com.hw16.domain

import com.hw16.data.UsefulActivitiesRepository
import com.hw16.data.UsefulActivityDto
import javax.inject.Inject

class GetUsefulActivityUseCase @Inject constructor(
    private val repository: UsefulActivitiesRepository
) {
    suspend fun execute(): UsefulActivityDto {
        return repository.getUsefulActivity()
    }
}