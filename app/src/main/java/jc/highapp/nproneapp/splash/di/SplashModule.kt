package jc.highapp.nproneapp.splash.di

import jc.highapp.nproneapp.splash.interactor.SplashInteractor
import jc.highapp.nproneapp.splash.presenter.SplashPresenter
import jc.highapp.nproneapp.splash.router.SplashRouter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider


fun Any.splashModule() : Kodein.Module {
    return Kodein.Module("SplashModule") {
        bind<SplashInteractor>() with provider { SplashInteractor() }
        bind<SplashRouter>() with provider { SplashRouter(instance(), instance()) }
        bind<SplashPresenter>() with provider { SplashPresenter(instance(), instance()) }
    }
}