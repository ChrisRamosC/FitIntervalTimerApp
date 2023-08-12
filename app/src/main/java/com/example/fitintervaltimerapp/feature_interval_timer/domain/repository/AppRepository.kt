package com.example.fitintervaltimerapp.feature_interval_timer.domain.repository

import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Exercise
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Routine
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.RoutineExerciseJoin
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    suspend fun upsertRoutine(routine: Routine)
    suspend fun updateRoutine(routine: Routine)
    suspend fun deleteRoutine(routine: Routine)
    fun getAllRoutines(): Flow<List<Routine>>
    fun getRoutineById(routineId: Long): Routine

    suspend fun upsertExercise(exercise: Exercise)
    suspend fun updateExercise(exercise: Exercise)
    suspend fun deleteExercise(exercise: Exercise)
    fun getAllExercises(): Flow<List<Exercise>>
    fun getExerciseById(exerciseId: Long): Exercise

    suspend fun insertRoutineExerciseJoin(routineExerciseJoin: RoutineExerciseJoin)
    suspend fun updateRoutineExerciseJoin(routineExerciseJoin: RoutineExerciseJoin)
    suspend fun deleteRoutineExerciseJoin(routineExerciseJoin: RoutineExerciseJoin)
    fun getRoutineExerciseJoinsByRoutineId(routineId: Long): Flow<List<RoutineExerciseJoin>>
    fun getRoutineExerciseJoinsByExerciseId(exerciseId: Long): Flow<List<RoutineExerciseJoin>>
}