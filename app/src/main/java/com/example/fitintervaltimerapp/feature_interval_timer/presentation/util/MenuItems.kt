package com.example.fitintervaltimerapp.feature_interval_timer.presentation.util

import com.example.fitintervaltimerapp.R

sealed class MenuItems(
    val icon: Int? = null,
    val title: String? = null,
    val route: String
){
    object RoutinesScreen: MenuItems(R.drawable.ic_baseline_featured_play_list_24, "Routines", "routines_screen")
    object TimerScreen: MenuItems(R.drawable.ic_baseline_timer_24, "Timer", "timer_screen")
    object HistoryScreen: MenuItems(R.drawable.ic_baseline_history_24, "History", "history_screen")
    object SettingsScreen: MenuItems(R.drawable.ic_baseline_settings_24, "Settings", "settings_screen")

    object AddEditRoutineScreen: MenuItems(route = "add_edit_routine_screen")
}
