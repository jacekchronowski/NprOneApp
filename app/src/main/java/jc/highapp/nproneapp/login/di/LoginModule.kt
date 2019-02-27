package jc.highapp.nproneapp.login.di

import jc.highapp.nproneapp.login.interactor.LoginOverrideUrlInteractor
import jc.highapp.nproneapp.login.interactor.LoginUrlInteractor
import jc.highapp.nproneapp.login.presenter.LoginPresenter
import jc.highapp.nproneapp.login.router.LoginRouter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

fun Any.loginModule() : Kodein.Module {
    return Kodein.Module("loginModule") {
        bind<LoginPresenter>() with provider {
            LoginPresenter(instance(), instance(), instance())
        }
        bind<LoginUrlInteractor>() with provider { LoginUrlInteractor() }
        bind<LoginOverrideUrlInteractor>() with provider { LoginOverrideUrlInteractor() }
        bind<LoginRouter>() with provider {
            LoginRouter(
                instance()
            )
        }
    }
}

