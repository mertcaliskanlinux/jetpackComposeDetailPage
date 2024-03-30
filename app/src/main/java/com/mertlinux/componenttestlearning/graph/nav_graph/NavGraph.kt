package com.mertlinux.componenttestlearning.graph.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mertlinux.componenttestlearning.graph.HOME_ROOT
import com.mertlinux.componenttestlearning.graph.ROUTE_ROOT
import com.mertlinux.componenttestlearning.graph.Screen

@Composable
fun SetupNavGraph(navController: NavController){


    NavHost(
        navController = navController as NavHostController,
        startDestination = HOME_ROOT,
        route = ROUTE_ROOT
    ){
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)

    }
}
