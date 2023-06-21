package com.example.mygoals.domain

class GetGoalsListUseCase(private val goalsListRepository: GoalsListRepository) {

    fun getGoalsList(): List<GoalsItem> {
        return  goalsListRepository.getGoalsList()
    }

}