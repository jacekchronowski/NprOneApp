package jc.highapp.nproneapp.login.di

import jc.highapp.nproneapp.login.domain.LoginWebPageResolver
import jc.highapp.nproneapp.login.presenter.LoginPresenter
import jc.highapp.nproneapp.routers.login.LoginRouter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

fun Any.loginModule() : Kodein.Module {
    return Kodein.Module("loginModule") {
        bind<LoginPresenter>() with provider {
            LoginPresenter(instance(), instance())
        }
        bind<LoginWebPageResolver>() with provider { LoginWebPageResolver() }
        bind<LoginRouter>() with provider { LoginRouter(instance()) }
    }
}

