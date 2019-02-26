package jc.highapp.nproneapp.navigation

import android.view.View
import android.widget.Toast
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.login.view.LoginFragment
import jc.highapp.nproneapp.main.MainActivity
import jc.highapp.nproneapp.splash.view.SplashFragment
import jc.highapp.nproneapp.util.replaceFragment
import jc.highapp.nproneapp.util.replaceFragmentOnTop
import kotlinx.android.synthetic.main.activity_main.*

class Navigator {

    private var activity : MainActivity? = null

    fun bindRoot(activity : MainActivity?) {
        this.activity = activity
    }

    fun unbindRoot() {
        activity = null
    }

    fun showLoginScreen() {
        activity?.replaceFragment(LoginFragment())
    }

    fun showBottomNavigationBar() {
        activity?.bottom_navigation_bar?.visibility = View.VISIBLE
    }

    fun hideBottomNavigationBar() {
        activity?.bottom_navigation_bar?.visibility = View.GONE
    }

    fun showSplashScreen() {
        activity?.replaceFragmentOnTop(SplashFragment())
    }

    fun showMainScreen() {
        Toast.makeText(activity, "Main Screen TBD,", Toast.LENGTH_LONG).show()
    }
}