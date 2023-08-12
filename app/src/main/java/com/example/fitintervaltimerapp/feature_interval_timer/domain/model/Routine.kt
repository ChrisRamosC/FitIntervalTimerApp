package com.example.fitintervaltimerapp.feature_interval_timer.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(tableName = "routines")
data class Routine(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val description: String?
)

class InvalidRoutineException(message: String): Exception(message)