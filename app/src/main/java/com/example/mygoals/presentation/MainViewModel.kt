package com.example.mygoals.presentation

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mygoals.data.GoalsListRepositoryImpl
import com.example.mygoals.domain.EditGoalsItemUseCase
import com.example.mygoals.domain.GetGoalsListUseCase
import com.example.mygoals.domain.DeletGoalsItemUseCase

import com.example.mygoals.domain.GoalsItem

class MainViewModel : ViewModel() {

    private val repository = GoalsListRepositoryImpl

    private val getGoalsListUseCase = GetGoalsListUseCase(repository)
    private val deleteGoalsItemUseCase = DeletGoalsItemUseCase(repository)
    private val editGoalsItemUseCase = EditGoalsItemUseCase(repository)

    val goalsList = MutableLiveData<List<GoalsItem>>()

    fun getGoalsList() {
        val list = getGoalsListUseCase.getGoalsList()
        goalsList.value = list
    }

    fun deleteGoalsItem(goalsItem: GoalsItem) {
        deleteGoalsItemUseCase.deletGoalsItem(goalsItem)
        getGoalsList()
    }

    fun changeEnableState(goalsItem: GoalsItem) {
        val newItem = goalsItem.copy(enable = !goalsItem.enable)
        editGoalsItemUseCase.editGoalsItem(newItem)
        getGoalsList()
    }
}
