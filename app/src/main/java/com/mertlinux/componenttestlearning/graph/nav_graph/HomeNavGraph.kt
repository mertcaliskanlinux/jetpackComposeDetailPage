package com.mertlinux.componenttestlearning.graph.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.mertlinux.componenttestlearning.graph.DETAIL_ARGUMENT_KEY
import com.mertlinux.componenttestlearning.graph.DETAIL_ARGUMENT_NAME
import com.mertlinux.componenttestlearning.graph.HOME_ROOT
import com.mertlinux.componenttestlearning.graph.Screen
import com.mertlinux.componenttestlearning.screen.DetailScreen
import com.mertlinux.componenttestlearning.screen.HomeScreen


fun NavGraphBuilder.homeNavGraph(navController: NavController){

    navigation(
        route = HOME_ROOT, //
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType // Argümanın türü
                    defaultValue = 0 // Default değer

                },
                navArgument(DETAIL_ARGUMENT_NAME) {
                    type = NavType.StringType
                    defaultValue = "defance"
                },
            )
        ){
            DetailScreen(navController = navController)
        }
    }

}