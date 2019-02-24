package jc.highapp.nproneapp.login.presenter

import jc.highapp.nproneapp.login.domain.LoginWebPageResolver
import jc.highapp.nproneapp.login.view.LoginView
import jc.highapp.nproneapp.mvp.BasePresenter
import jc.highapp.nproneapp.routers.login.LoginRouter

class LoginPresenter(
    private val loginWebPageResolver: LoginWebPageResolver,
    private val loginRouter: LoginRouter
) : BasePresenter<LoginView>() {

    override fun onInit() {
        view?.initWebView()
        view?.loadWebPage(loginWebPageResolver.resolveAddress())
    }

    fun onLoginSuccess() {
        loginRouter.showScreenAfterLogin()
    }

}