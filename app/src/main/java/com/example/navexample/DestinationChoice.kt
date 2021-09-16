package com.example.navexample

import androidx.navigation.NavController
import androidx.navigation.compose.navArgument
import com.example.navexample.Constants.DESTINATION_A

class DestinationChoice(navController: NavController) {

    val task: () -> Unit = {
        navController.navigate(route = DESTINATION_A)
    }
}