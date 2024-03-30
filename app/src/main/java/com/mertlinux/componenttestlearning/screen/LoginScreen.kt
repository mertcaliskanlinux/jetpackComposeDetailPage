package com.mertlinux.componenttestlearning.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mertlinux.componenttestlearning.graph.HOME_ROOT
import com.mertlinux.componenttestlearning.graph.Screen


@Composable
fun LoginScreen(navController : NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier
                    .clickable { navController.navigate(HOME_ROOT) }
                    .align(Alignment.Center),
                text = "Login",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineLarge,
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
            )
            Text(
                modifier = Modifier
                    .padding(top = 150.dp)
                    .clickable {
                        navController.popBackStack()
                        navController.navigate(Screen.Detail.passedId(1,"mert"))
                    },
                text = "Open Detail Screen",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.labelLarge,
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                fontFamily = MaterialTheme.typography.bodyMedium.fontFamily,
            )
        }
    }
}






@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(navController = androidx.navigation.compose.rememberNavController())
}