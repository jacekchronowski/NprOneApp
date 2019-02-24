package jc.highapp.nproneapp.navigation

import android.view.View
import android.widget.Toast
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.login.view.LoginFragment
import jc.highapp.nproneapp.main.MainActivity
import jc.highapp.nproneapp.splash.view.SplashFragment
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
        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.fragment_container, LoginFragment(), LoginFragment::class.java.simpleName)
            ?.addToBackStack(LoginFragment::class.java.simpleName)
            ?.commit()
    }

    fun showBottomNavigationBar() {
        activity?.bottom_navigation_bar?.visibility = View.VISIBLE
    }

    fun hideBottomNavigationBar() {
        activity?.bottom_navigation_bar?.visibility = View.GONE
    }

    fun showSplashScreen() {
        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.fragment_container, SplashFragment(), SplashFragment::class.java.simpleName)
            ?.addToBackStack(LoginFragment::class.java.simpleName)
            ?.commit()
    }

    fun showMainScreen() {
        Toast.makeText(activity, "Main Screen TBD,", Toast.LENGTH_LONG).show()
    }
}