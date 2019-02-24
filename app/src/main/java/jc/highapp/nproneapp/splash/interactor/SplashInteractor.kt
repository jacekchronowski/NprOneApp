package jc.highapp.nproneapp.splash.interactor

import io.reactivex.Completable
import java.util.concurrent.TimeUnit

class SplashInteractor {

    fun execute() : Completable {
        return Completable.timer(3, TimeUnit.SECONDS)
    }
}