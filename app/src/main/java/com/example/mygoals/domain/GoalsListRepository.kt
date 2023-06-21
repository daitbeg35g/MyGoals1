package com.example.mygoals.domain

interface GoalsListRepository {

    fun addGoalsItem(goalsItem: GoalsItem)

    fun deletGoalsItem(goalsItem: GoalsItem)

    fun editGoalsItem(goalsItem: GoalsItem)

    fun getGoalsList(): List<GoalsItem>

    fun getGoalsItem(goalsItemId: Int): GoalsItem
}