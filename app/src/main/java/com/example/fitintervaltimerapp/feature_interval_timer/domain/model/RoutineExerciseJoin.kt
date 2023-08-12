package com.example.fitintervaltimerapp.feature_interval_timer.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(tableName = "routine_exercise_join",
    primaryKeys = ["routineId", "exerciseId"],
    foreignKeys = [
        ForeignKey(entity = Routine::class,
            parentColumns = ["id"],
            childColumns = ["routineId"]),
        ForeignKey(entity = Exercise::class,
            parentColumns = ["id"],
            childColumns = ["exerciseId"])
    ])
data class RoutineExerciseJoin(
    val routineId: Long,
    val exerciseId: Long
)
