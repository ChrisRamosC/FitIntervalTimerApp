package com.example.fitintervaltimerapp.di

import android.app.Application
import androidx.room.Room
import com.example.fitintervaltimerapp.feature_interval_timer.data.data_source.AppDatabase
import com.example.fitintervaltimerapp.feature_interval_timer.data.repository.AppRepositoryImpl
import com.example.fitintervaltimerapp.feature_interval_timer.domain.repository.AppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideAppRepository(db: AppDatabase): AppRepository {
        return AppRepositoryImpl(db.routineDao, db.exerciseDao, db.routineExerciseJoinDao)
    }
}