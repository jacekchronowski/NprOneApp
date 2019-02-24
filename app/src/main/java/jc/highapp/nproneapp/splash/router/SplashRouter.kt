package jc.highapp.nproneapp.splash.router

import jc.highapp.nproneapp.navigation.Navigator
import jc.highapp.nproneapp.authentication.UserManager

class SplashRouter(
    private val navigator: Navigator,
    private val userManager: UserManager) {

    fun showAfterSplashScreen() {
        if(userManager.isUserLoggedIn()) {
            navigator.showMainScreen()
            navigator.showBottomNavigationBar()
        } else {
            navigator.showLoginScreen()
            navigator.hideBottomNavigationBar()
        }
    }
}