package com.hw16.presentation

import androidx.lifecycle.ViewModel
import com.hw16.data.UsefulActivityDto
import com.hw16.domain.GetUsefulActivityUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getUsefulActivityUseCase: GetUsefulActivityUseCase
) : ViewModel() {
    private val usefulActivityDto = UsefulActivityDto(
        "",
        "",
        0,
        0.0,
        "",
        0,
        0.0
    )
    private val _stateFlow = MutableStateFlow(usefulActivityDto)
    val stateFlow = _stateFlow.asStateFlow()

    suspend fun reloadUsefulActivity() {
        _stateFlow.value = getUsefulActivityUseCase.execute()
    }
}