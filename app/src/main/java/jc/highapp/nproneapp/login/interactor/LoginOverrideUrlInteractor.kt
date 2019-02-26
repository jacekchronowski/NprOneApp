package jc.highapp.nproneapp.login.interactor

import jc.highapp.nproneapp.constants.Constants

class LoginOverrideUrlInteractor {
    fun execute(url : String?) : Boolean {
        return url == Constants.REDIRECT_URI
    }
}