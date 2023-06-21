package com.example.mygoals.domain

class GetGoalsItemUseCase(private val goalsListRepository: GoalsListRepository) {

    fun getGoalsItem(goalsItemId: Int): GoalsItem{
        return goalsListRepository.getGoalsItem(goalsItemId)
    }
}