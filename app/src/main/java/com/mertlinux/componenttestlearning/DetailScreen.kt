package com.mertlinux.componenttestlearning


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mertlinux.componenttestlearning.graph.Screen

/*navController.navigate(Screen.Home.route)}*/

@Composable
fun DetailScreen(navController: NavController) {

    Box( // Box ile içerikleri hizalarız
        modifier =Modifier.fillMaxSize(), // modifiyer ile Box'ın boyutunu belirleriz fillMaxSize ile tüm ekranı kaplar
        contentAlignment = Alignment.Center // contentAlignment ile içeriklerin hizalanmasını belirleriz Center ile içeriklerin ekranın ortasında hizalanmasını sağlarız
    ){
        Text( // Text ile metin ekleriz
            text = "DetailScreen !!",
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.headlineLarge,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            modifier = Modifier.clickable(onClick = {
                navController.navigate(Screen.Home.route){
                    popUpTo(Screen.Home.route){ // popUpTo fonksiyonu ile geri tuşuna basıldığında hangi ekrana gidileceğini belirleriz //popupto ne işe yarar ? Geri tuşuna basıldığında hangi ekrana gidileceğini belirler ve bu ekrana kadar olan tüm ekranları temizler

                        inclusive = true // inclusive parametresi true ise popUpTo fonksiyonunun içindeki ekranda dahil olmak üzere tüm ekranları temizler
                    }
                }
            })
                .align(Alignment.Center), // align fonksiyonu ile metni hizalarız Alignment.Center ile metni ekranın ortasına hizalarız
            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(navController = rememberNavController())
}
