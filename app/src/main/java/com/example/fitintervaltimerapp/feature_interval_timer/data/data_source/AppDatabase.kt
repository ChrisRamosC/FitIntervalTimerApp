package com.example.fitintervaltimerapp.feature_interval_timer.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Exercise
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Routine
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.RoutineExerciseJoin

@Database(
    entities = [Routine::class, Exercise::class, RoutineExerciseJoin::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase(){
    abstract val routineDao: RoutineDao
    abstract val exerciseDao: ExerciseDao
    abstract val routineExerciseJoinDao: RoutineExerciseJoinDao

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}