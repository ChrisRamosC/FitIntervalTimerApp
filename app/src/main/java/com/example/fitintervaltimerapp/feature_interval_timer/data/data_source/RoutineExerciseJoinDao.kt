package com.example.fitintervaltimerapp.feature_interval_timer.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.RoutineExerciseJoin
import kotlinx.coroutines.flow.Flow

@Dao
interface RoutineExerciseJoinDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(routineExerciseJoin: RoutineExerciseJoin)

    @Update
    suspend fun update(routineExerciseJoin: RoutineExerciseJoin)

    @Delete
    suspend fun delete(routineExerciseJoin: RoutineExerciseJoin)

    @Query("SELECT * FROM routine_exercise_join WHERE routineId = :routineId")
    fun getRoutineExerciseJoinsByRoutineId(routineId: Long): Flow<List<RoutineExerciseJoin>>

    @Query("SELECT * FROM routine_exercise_join WHERE exerciseId = :exerciseId")
    fun getRoutineExerciseJoinsByExerciseId(exerciseId: Long): Flow<List<RoutineExerciseJoin>>
}