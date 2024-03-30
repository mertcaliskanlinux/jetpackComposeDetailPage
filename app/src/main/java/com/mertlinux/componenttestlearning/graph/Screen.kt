package com.mertlinux.componenttestlearning.graph


const val DETAIL_ARGUMENT_KEY = "id" // DETAIL_SCREEN_KEY değişkenine "id" değerini atar // const ne işe yarar ? Sabit bir değer oluşturur ve bu değeri değiştiremezsiniz
const val DETAIL_ARGUMENT_NAME = "name" // DETAIL_SCREEN_NAME değişkenine "name" değerini atar
const val AUTHENTİCATION_ROOT = "authentication"
const val HOME_ROOT = "home" //
const val ROUTE_ROOT = "root"
sealed class Screen(val route:String) {
    object Home : Screen(route = "home_screen")

    object Detail : Screen("detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_NAME}") {
        fun passedId(id: Int = 0,name:String="defance"): String {
            return this.route.replace("{$DETAIL_ARGUMENT_KEY}",id.toString()).replace("{$DETAIL_ARGUMENT_NAME}",name) //burası ne yapar ? route değişkenindeki "{$DETAIL_ARGUMENT_KEY}" ve "{$DETAIL_ARGUMENT_NAME}" değerlerini id ve name değerleri ile değiştirir ve döndürür
        }
    }

    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "sign_up_screen")

}




































    // burası ne yapar ? id parametresini alır ve "detail_screen/$id" değerini döndürür ne işe yarar ? id parametresini alır ve "detail_screen/$id" değerini döndürür
    //object Detail : Screen(route="detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_NAME}") // burası ne yapar ? DetailScreen sınıfını çağırır ve route parametresine detail_screen değerini verir ne işe yarar ? Screen sınıfını miras alan Home ve Detail sınıflarını oluşturur

    //optional argument
    //object Detail : Screen("detail_screen?id={id}") {
    //    fun passedId(id: Int = 0): String {
    //        return "detail_screen/$id" //burası ne yapar ? id değerini alır ve "detail_screen/$id" değerini döndürür
    //    }
    //}

    /* single required argument hardcode
     fun passedId(id:String):String{
         return "detail_screen/$id" //burası ne yapar ? id değerini alır ve "detail_screen/$id" değerini döndürür
     }
    //single required argument
    fun passedId(id:Int,name:String):String{
        return this.route.replace("{$DETAIL_ARGUMENT_KEY}",id.toString()) //burası ne yapar ? route değişkenindeki "{$DETAIL_ARGUMENT_KEY}" değerini id değeri ile değiştirir ve döndürür
    }

    fun passNameAndId(id:Int,name:String):String{
        return this.route.replace("{$DETAIL_ARGUMENT_KEY}",id.toString()).replace("{$DETAIL_ARGUMENT_NAME}",name) //burası ne yapar ? route değişkenindeki "{$DETAIL_ARGUMENT_KEY}" ve "{$DETAIL_ARGUMENT_NAME}" değerlerini id ve name değerleri ile değiştirir ve döndürür
    }*/



