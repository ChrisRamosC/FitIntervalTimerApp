package com.example.fitintervaltimerapp.feature_interval_timer.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitintervaltimerapp.feature_interval_timer.presentation.routines.RoutinesScreen
import com.example.fitintervaltimerapp.feature_interval_timer.presentation.util.MenuItems
import com.example.fitintervaltimerapp.ui.theme.FitIntervalTimerAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitIntervalTimerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()


                    NavHost(
                        navController = navController,
                        startDestination = MenuItems.RoutinesScreen.route
                    ) {
                        composable(route = MenuItems.RoutinesScreen.route) {
                            RoutinesScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}