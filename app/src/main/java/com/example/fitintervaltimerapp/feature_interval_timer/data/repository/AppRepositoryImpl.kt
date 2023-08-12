package com.example.fitintervaltimerapp.feature_interval_timer.data.repository

import com.example.fitintervaltimerapp.feature_interval_timer.data.data_source.ExerciseDao
import com.example.fitintervaltimerapp.feature_interval_timer.data.data_source.RoutineDao
import com.example.fitintervaltimerapp.feature_interval_timer.data.data_source.RoutineExerciseJoinDao
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Exercise
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Routine
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.RoutineExerciseJoin
import com.example.fitintervaltimerapp.feature_interval_timer.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow

class AppRepositoryImpl(
    private val routineDao: RoutineDao,
    private val exerciseDao: ExerciseDao,
    private val routineExerciseJoinDao: RoutineExerciseJoinDao
) : AppRepository {
    override fun getAllRoutines(): Flow<List<Routine>> {
        return routineDao.getAllRoutines()
    }

    override fun getRoutineById(routineId: Long): Routine {
        return routineDao.getRoutineById(routineId)
    }

    override suspend fun upsertRoutine(routine: Routine) {
        routineDao.upsertRoutine(routine)
    }

    override suspend fun updateRoutine(routine: Routine) {
        routineDao.updateRoutine(routine)
    }

    override suspend fun deleteRoutine(routine: Routine) {
        routineDao.deleteRoutine(routine)
    }


    override suspend fun upsertExercise(exercise: Exercise) {
        exerciseDao.upsertExercise(exercise)
    }

    override suspend fun updateExercise(exercise: Exercise) {
        exerciseDao.updateExercise(exercise)
    }

    override suspend fun deleteExercise(exercise: Exercise) {
        exerciseDao.deleteExercise(exercise)
    }

    override fun getAllExercises(): Flow<List<Exercise>> {
        return exerciseDao.getAllExercises()
    }

    override fun getExerciseById(exerciseId: Long): Exercise {
        return exerciseDao.getExerciseById(exerciseId)
    }

    override suspend fun insertRoutineExerciseJoin(routineExerciseJoin: RoutineExerciseJoin) {
        routineExerciseJoinDao.insert(routineExerciseJoin)
    }

    override suspend fun updateRoutineExerciseJoin(routineExerciseJoin: RoutineExerciseJoin) {
        routineExerciseJoinDao.update(routineExerciseJoin)
    }

    override suspend fun deleteRoutineExerciseJoin(routineExerciseJoin: RoutineExerciseJoin) {
        routineExerciseJoinDao.delete(routineExerciseJoin)
    }

    override fun getRoutineExerciseJoinsByRoutineId(routineId: Long): Flow<List<RoutineExerciseJoin>> {
        return routineExerciseJoinDao.getRoutineExerciseJoinsByRoutineId(routineId)
    }

    override fun getRoutineExerciseJoinsByExerciseId(exerciseId: Long): Flow<List<RoutineExerciseJoin>> {
        return routineExerciseJoinDao.getRoutineExerciseJoinsByExerciseId(exerciseId)
    }
}