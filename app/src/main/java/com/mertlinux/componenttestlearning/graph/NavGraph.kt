package com.mertlinux.componenttestlearning.graph

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mertlinux.componenttestlearning.screen.DetailScreen
import com.mertlinux.componenttestlearning.screen.HomeScreen

@Composable
fun SetupNavGraph(navController: NavController){
    // Aşağıdaki yeri Açıkla ?
    // Aşağıdaki kod, uygulamanın navigasyon yapısını oluşturur.
    // NavHost, NavController tarafından yönetilen bir navigasyon konteynırıdır.
    // NavHost'a bir NavController ve bir başlangıç destinasyonu verilmelidir.
    // Aşağıdaki kodda, NavController olarak navController ve başlangıç destinasyonu olarak Screen.Home.route kullanılmıştır.
    // Ek olarak, HomeScreen ve DetailScreen için composable destinasyonlar oluşturulmuştur.
    // Bu destinasyonlar, belirli bir rota eşleştiğinde görüntülenir.
    // arguments parametresi, destinasyonun bir argüman alıp almadığını belirtir.
    // DetailScreen için bir id argümanı tanımlanmıştır.
    // Bu argüman, DetailScreen'e gidildiğinde alınan bir argümanı temsil eder.


    NavHost(
        navController = navController as NavHostController,
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
            Log.d("Args",it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())

            Log.d("Args",it.arguments?.getString(DETAIL_ARGUMENT_NAME).toString())
            DetailScreen(navController = navController)
        }
    }
}

