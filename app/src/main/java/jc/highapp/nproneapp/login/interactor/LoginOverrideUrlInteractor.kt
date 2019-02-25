package jc.highapp.nproneapp.login.interactor

import jc.highapp.nproneapp.util.Constants

class LoginOverrideUrlInteractor {
    fun execute(url : String?) : Boolean {
        return url == Constants.REDIRECT_URI
    }
}