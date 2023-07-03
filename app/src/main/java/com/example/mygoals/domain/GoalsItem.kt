package com.example.mygoals.domain

data class GoalsItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFINED_ID

) {
    companion object{
        const val UNDEFINED_ID = -1
    }

}
