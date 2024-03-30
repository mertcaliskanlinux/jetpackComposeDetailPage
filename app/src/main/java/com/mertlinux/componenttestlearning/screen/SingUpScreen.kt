package com.mertlinux.componenttestlearning.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController


@Composable
fun SingUpScreen(navController : NavController) {
    Box(modifier =Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
            },
            text = "SingUpScreen",
            color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge,
            fontSize = androidx.compose.material3.MaterialTheme.typography.headlineLarge.fontSize,
            fontFamily = androidx.compose.material3.MaterialTheme.typography.headlineLarge.fontFamily

        )
    }
}

@Preview(showBackground = true)
@Composable
fun SingUpScreenPreview() {
    SingUpScreen(navController = androidx.navigation.compose.rememberNavController())
}