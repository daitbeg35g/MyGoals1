package com.example.mygoals.data

import com.example.mygoals.domain.GoalsItem
import com.example.mygoals.domain.GoalsListRepository
import java.lang.RuntimeException

object GoalsListRepositoryImpl : GoalsListRepository {

    private val goalsList = mutableListOf<GoalsItem>()

    private var autoIncrementId = 0

    init {
        for (i in 0 until 10) {
            val item = GoalsItem("Name $i", i, true)
            addGoalsItem(item)
        }
    }

    override fun addGoalsItem(goalsItem: GoalsItem) {
        if (goalsItem.id == GoalsItem.UNDEFINED_ID) {
            goalsItem.id = autoIncrementId++
        }
        goalsList.add(goalsItem)
    }

    override fun deletGoalsItem(goalsItem: GoalsItem) {
        goalsList.remove(goalsItem)
    }

    override fun editGoalsItem(goalsItem: GoalsItem) {
        val oldElement = getGoalsItem(goalsItem.id)
        goalsList.remove(oldElement)
        addGoalsItem(goalsItem)
    }

    override fun getGoalsItem(goalsItemId: Int): GoalsItem {
        return goalsList.find {
            it.id == goalsItemId
        } ?: throw RuntimeException("Element with id $goalsItemId not found")
    }

    override fun getGoalsList(): List<GoalsItem> {
        return goalsList.toList()
    }



}

