package jc.highapp.nproneapp.main

import android.app.Application
import jc.highapp.nproneapp.login.LoginPresenter
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider

class NprOneApplication : Application(), KodeinAware {
    override val kodein: Kodein by Kodein.lazy {
        bind<LoginPresenter>() with provider { LoginPresenter() }
    }

}