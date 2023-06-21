package com.example.mygoals.domain

class DeletGoalsItemUseCase(private val goalsListRepository: GoalsListRepository) {

    fun deletGoalsItem(goalsItem: GoalsItem) {
        goalsListRepository.deletGoalsItem(goalsItem)
    }
}