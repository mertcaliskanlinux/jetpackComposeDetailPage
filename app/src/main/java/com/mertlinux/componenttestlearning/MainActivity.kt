package com.mertlinux.componenttestlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mertlinux.componenttestlearning.graph.nav_graph.SetupNavGraph
import com.mertlinux.componenttestlearning.ui.theme.ComponentTestLearningTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavController // navController'ı tanımla ve başlangıç değeri verme

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentTestLearningTheme {
                navController = rememberNavController() // burası rememberNavController() idi yani navController'ı hatırla

                SetupNavGraph(navController = navController) // burasi SetupNavGraph fonksiyonunu çağırıyor ve navController'ı parametre olarak gönderiyor

            }
        }
    }
}
