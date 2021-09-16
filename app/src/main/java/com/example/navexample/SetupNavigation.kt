package com.example.navexample

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navexample.Constants.DESTINATION_A
import com.example.navexample.Constants.DESTINATION_B

@Composable
fun SetupNavigation(
    navController: NavHostController
){

    val destinationChoice = remember(navController) {
        DestinationChoice(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = DESTINATION_A
    ){
        desAComposable(
            navigateToB = destinationChoice.task
        )
        desBComposable()
    }
}

/* Destination A*/

fun NavGraphBuilder.desAComposable(
    navigateToB: () -> Unit
){
    composable(
        route = DESTINATION_A
    ){
        DestinationA(
            navigateToB = navigateToB
        )
    }
}

@Composable
fun DestinationA(
    navigateToB: () -> Unit
){
    Scaffold(
        content = {},
        floatingActionButton = {
            DestinationFab(onFabClicked = navigateToB)
        },
    )
}

@Composable
fun DestinationFab(
    onFabClicked: () -> Unit
){
    Button(
        onClick = onFabClicked
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add A",
            tint = Color.White
        )
    }
}

/* Destination B */
fun NavGraphBuilder.desBComposable(){
    composable(
        route = DESTINATION_B //自分の場所を教える
    ){
        DestinationB()
    }
}

@Composable
fun DestinationB(){
    Text(text = "Destination B")
}