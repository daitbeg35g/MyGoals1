package com.example.mygoals.domain

class AddGoalsItemUseCase(private val goalsListRepository: GoalsListRepository) {

    fun addGoalsItem(goalsItem: GoalsItem) {
        goalsListRepository.addGoalsItem(goalsItem)
    }
}