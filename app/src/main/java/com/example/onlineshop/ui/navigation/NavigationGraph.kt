package com.example.onlineshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onlineshop.ui.AppViewModelProvider
import com.example.onlineshop.ui.menu.AccountScreen.AccountScreen
import com.example.onlineshop.ui.menu.CartScreen
import com.example.onlineshop.ui.menu.catalogScreen.CatalogScreen
import com.example.onlineshop.ui.menu.GeneralScreen
import com.example.onlineshop.ui.menu.SalesScreen
import com.example.onlineshop.ui.menu.catalogScreen.CatalogProductScreenViewModel
import com.example.onlineshop.ui.menu.catalogScreen.ProductScreen
import com.example.onlineshop.ui.registrationScreen.RegistrationScreen

/**
 * Provides Navigation graph for the application.
 */
@Composable
fun OnlineShopNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val catalogProductScreenViewModel: CatalogProductScreenViewModel = viewModel(factory = AppViewModelProvider.Factory)
    NavHost(
        navController = navController,
        startDestination = RegistrationDestination.route,
        modifier = modifier
    ) {
        composable(route = RegistrationDestination.route) {
            RegistrationScreen(
                title = RegistrationDestination.title,
                navigateToGeneral = {navController.navigate(GeneralDestination.route)},
                navigateToCatalog = {navController.navigate(CatalogDestination.route)}
            )
        }
        composable(
            route = ProductDestination.route,
//            route = ProductDestination.routeWithArgs, //Нужно чтобы прокинуть состояние с одного экрана на другой
//            arguments = listOf(navArgument(ProductDestination.itemIdArg) {
//                type = NavType.StringType
//            })
        ) {
            ProductScreen(
                title = ProductDestination.title,
                navController = navController,
                navigateBack = {navController.popBackStack()},
                previousRoute = CatalogDestination.route,
                catalogProductScreenViewModel = catalogProductScreenViewModel
            )
        }
        composable(route = GeneralDestination.route) {
            GeneralScreen(
                title = GeneralDestination.title,
                navController = navController
            )
        }
        composable(route = CatalogDestination.route) {
            CatalogScreen(
                title = CatalogDestination.title,
//                navigateToProductPage = { navController.navigate("${ProductDestination.route}/${it}")},
                navigateToProductPage = { navController.navigate(ProductDestination.route) },
                navController = navController,
                catalogProductScreenViewModel = catalogProductScreenViewModel
            )
        }
        composable(route = CartDestination.route) {
            CartScreen(
                title = CartDestination.title,
                navController = navController
            )
        }
        composable(route = SalesDestination.route) {
            SalesScreen(
                title = SalesDestination.title,
                navController = navController
            )
        }
        composable(route = AccountDestination.route) {
            AccountScreen(
                navController = navController
            )
        }
    }
}