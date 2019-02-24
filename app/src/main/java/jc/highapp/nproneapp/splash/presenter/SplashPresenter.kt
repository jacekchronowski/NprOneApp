package jc.highapp.nproneapp.splash.presenter

import jc.highapp.nproneapp.mvp.BasePresenter
import jc.highapp.nproneapp.splash.interactor.SplashInteractor
import jc.highapp.nproneapp.splash.router.SplashRouter
import jc.highapp.nproneapp.splash.view.SplashView

class SplashPresenter(
    private val splashInteractor: SplashInteractor,
    private val splashRouter: SplashRouter) : BasePresenter<SplashView>() {
    override fun onInit() {
        splashInteractor
            .execute()
            .subscribe(
                { splashRouter.showAfterSplashScreen() },
                {})
    }

}