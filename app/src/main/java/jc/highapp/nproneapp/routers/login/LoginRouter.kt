package jc.highapp.nproneapp.routers.login

import jc.highapp.nproneapp.navigation.Navigator

class LoginRouter(private val navigator: Navigator) {

    fun showScreenAfterLogin() {
        navigator.showMainScreen()
        navigator.showBottomNavigationBar()
    }

    fun startFlow() {
        navigator.showSplashScreen()
        navigator.hideBottomNavigationBar()
    }
}