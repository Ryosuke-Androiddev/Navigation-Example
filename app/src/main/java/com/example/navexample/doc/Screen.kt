package com.example.navexample.doc

sealed class Screen(val route: String){
    object DestinationA: Screen("Destination_A")
    object DestinationB: Screen("DESTINATION_B")
}
