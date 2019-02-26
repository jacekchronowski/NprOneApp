package jc.highapp.nproneapp.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import jc.highapp.nproneapp.R

fun FragmentActivity?.replaceFragment(fragment : Fragment) {

    this?.supportFragmentManager
        ?.beginTransaction()
        ?.replace(R.id.fragment_container, fragment, fragment.javaClass.simpleName)
        ?.addToBackStack(fragment.javaClass.simpleName)
        ?.commit()
}

fun FragmentActivity?.replaceFragmentOnTop(fragment : Fragment) {

    this?.supportFragmentManager
        ?.beginTransaction()
        ?.replace(R.id.fragment_container, fragment, fragment.javaClass.simpleName)
        ?.commit()
}