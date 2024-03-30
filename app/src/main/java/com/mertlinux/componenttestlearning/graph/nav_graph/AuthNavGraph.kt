package com.mertlinux.componenttestlearning.graph.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mertlinux.componenttestlearning.graph.AUTHENTİCATION_ROOT
import com.mertlinux.componenttestlearning.graph.Screen
import com.mertlinux.componenttestlearning.screen.LoginScreen
import com.mertlinux.componenttestlearning.screen.SingUpScreen



fun NavGraphBuilder.authNavGraph(navController : NavController){

    navigation(
        route = AUTHENTİCATION_ROOT,
        startDestination = Screen.Login.route

    ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SingUpScreen(navController = navController)
        }
    }
}