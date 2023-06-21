package com.example.mygoals.domain

class EditGoalsItemUseCase(private val goalsListRepository: GoalsListRepository) {

    fun editGoalsItem(goalsItem: GoalsItem) {
        goalsListRepository.editGoalsItem(goalsItem)
    }
}