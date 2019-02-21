package jc.highapp.nproneapp.login

import jc.highapp.nproneapp.main.BasePresenter

class LoginPresenter(private val loginWebPageResolver: LoginWebPageResolver) : BasePresenter<LoginView>() {

    override fun onInit() {
        view?.initWebView()
        view?.loadWebPage(loginWebPageResolver.resolveAddress())
    }

    fun onLoginSuccess() {

    }

}