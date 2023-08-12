package com.example.fitintervaltimerapp.feature_interval_timer.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import androidx.room.Upsert
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Exercise
import com.example.fitintervaltimerapp.feature_interval_timer.domain.model.Routine
import kotlinx.coroutines.flow.Flow

@Dao
interface RoutineDao {
    @Upsert
    suspend fun upsertRoutine(routine: Routine)

    @Update
    suspend fun updateRoutine(routine: Routine)

    @Delete
    suspend fun deleteRoutine(routine: Routine)

    @Query("SELECT * FROM routines")
    fun getAllRoutines(): Flow<List<Routine>>

    @Query("SELECT * FROM routines WHERE id = :routineId")
    fun getRoutineById(routineId: Long): Routine
}