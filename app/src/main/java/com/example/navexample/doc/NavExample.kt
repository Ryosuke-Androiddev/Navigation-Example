package com.example.navexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.navexample.Constants.DESTINATION_A
import com.example.navexample.Constants.DESTINATION_B

@Composable
fun NavExample(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = DESTINATION_A
    ){
        composable(route = DESTINATION_A){
            MoveBDestination(navController = navController)
        }

        composable(route = DESTINATION_B){
            ShowDestination(navController = navController)
        }
    }
}

@Composable
fun MoveBDestination(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { navController.navigate(DESTINATION_B)},
        ) {
            Text(text = "Move to B")
        }
    }
}

@Composable
fun ShowDestination(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { navController.navigate(DESTINATION_A)},
        ) {
            Text(text = "Move to A")
        }
    }
}