package com.example.onlineshop.ui.navigation

import androidx.compose.ui.graphics.Color
import com.example.onlineshop.R

interface NavigationDestination {
    val route: String
    val title: Int
}
interface NavigationDestinationForBottomBar : NavigationDestination {
    val icon : Int
    val tint : Color
}
object RegistrationDestination : NavigationDestination {
    override val route = "registration"
    override val title = R.string.registration
}
object ProductDestination : NavigationDestination {
    override val route = "product"
    override val title = R.string.product
}
object FavoritesDestination : NavigationDestination {
    override val route = "favorite"
    override val title = R.string.favorite
}
object GeneralDestination : NavigationDestinationForBottomBar {
    override val route = "general"
    override val title = R.string.general
    override val icon = R.drawable.icon_home
    override val tint = Color.Red
}
object CatalogDestination : NavigationDestinationForBottomBar{
    override val route = "catalog"
    override val title = R.string.catalog
    override val icon = R.drawable.icon_catalog
    override val tint = Color.Red
}
object CartDestination : NavigationDestinationForBottomBar {
    override val route = "cart"
    override val title = R.string.cart
    override val icon = R.drawable.icon_cart
    override val tint = Color.Red
}
object SalesDestination : NavigationDestinationForBottomBar {
    override val route = "sales"
    override val title = R.string.sales
    override val icon = R.drawable.icon_sales
    override val tint = Color.Red
}
object AccountDestination : NavigationDestinationForBottomBar {
    override val route = "account"
    override val title = R.string.account
    override val icon = R.drawable.icon_account
    override val tint = Color.Red
}


//sealed class BottomBarScreens(
//    val route: String,
//    val title: Int,
//    val icon: Int,
//    val tint : Color
//) {
//    object GeneralDestination : BottomBarScreens(
//        route = "general",
//        title = R.string.general,
//        icon = R.drawable.icon_home,
//        tint = Color.Red
//    )
//    object CatalogDestination : BottomBarScreens(
//        route = "catalog",
//        title = R.string.catalog,
//        icon = R.drawable.icon_catalog,
//        tint = Color.Red
//    )
//    object CartDestination : BottomBarScreens(
//        route = "cart",
//        title = R.string.cart,
//        icon = R.drawable.icon_cart,
//        tint = Color.Red
//    )
//    object SalesDestination : BottomBarScreens(
//        route = "sales",
//        title = R.string.sales,
//        icon = R.drawable.icon_sales,
//        tint = Color.Red
//    )
//    object AccountDestination : BottomBarScreens(
//        route = "account",
//        title = R.string.account,
//        icon = R.drawable.icon_account,
//        tint = Color.Red
//    )
//}


//sealed class NavigationDestination(
//    val route: String,
//    val title: Int
//) {
//    object RegistrationDestination : NavigationDestination(
//        route = "registration",
//        title = R.string.registration
//    )
//    object GeneralDestination: NavigationDestination(
//        route = "general",
//        title = R.string.general
//    ){
//        val icon = R.drawable.icon_home
//        val tint = Color.Red
//    }
//    object CatalogDestination: NavigationDestination(
//        route = "catalog",
//        title = R.string.catalog
//    ){
//        val icon = R.drawable.icon_catalog
//        val tint = Color.Red
//    }
//    object CartDestination : NavigationDestination(
//        route = "cart",
//        title = R.string.cart
//    ){
//        val icon = R.drawable.icon_cart
//        val tint = Color.Red
//    }
//    object SalesDestination : NavigationDestination(
//        route = "sales",
//        title = R.string.sales
//    ){
//        val icon = R.drawable.icon_sales
//        val tint = Color.Red
//    }
//    object AccountDestination : NavigationDestination(
//        route = "account",
//        title = R.string.account
//    ){
//        val icon = R.drawable.icon_account
//        val tint = Color.Red
//    }
//}

