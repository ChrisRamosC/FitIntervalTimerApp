package com.example.fitintervaltimerapp.feature_interval_timer.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "exercises")
data class Exercise(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val description: String?,
    val repetitions: Int?,
    val duration: Int?,
    val restTime: Int,
)

class InvalidExerciseException(message: String): Exception(message)