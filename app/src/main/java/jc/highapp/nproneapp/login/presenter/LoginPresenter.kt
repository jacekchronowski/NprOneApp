package jc.highapp.nproneapp.login.presenter

import jc.highapp.nproneapp.login.interactor.LoginOverrideUrlInteractor
import jc.highapp.nproneapp.login.interactor.LoginUrlInteractor
import jc.highapp.nproneapp.login.view.LoginView
import jc.highapp.nproneapp.mvp.BasePresenter
import jc.highapp.nproneapp.routers.login.LoginRouter

class LoginPresenter(
    private val loginUrlInteractor: LoginUrlInteractor,
    private val loginOverrideUrlInteractor: LoginOverrideUrlInteractor,
    private val loginRouter: LoginRouter) : BasePresenter<LoginView>() {

    override fun onInit() {
        view?.initWebView()
        view?.loadWebPage(loginUrlInteractor.execute())
    }

    fun onLoginSuccess() {
        loginRouter.showScreenAfterLogin()
    }

    fun onOverrideUrlLoading(url: String?) {
        if(loginOverrideUrlInteractor.execute(url)) {
            loginRouter.showScreenAfterLogin()
        } else {

        }
    }

}