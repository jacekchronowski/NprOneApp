package jc.highapp.nproneapp.main

import android.app.Application
import jc.highapp.nproneapp.authentication.UserManager
import jc.highapp.nproneapp.login.di.loginModule
import jc.highapp.nproneapp.navigation.Navigator
import jc.highapp.nproneapp.splash.di.splashModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

class NprOneApplication : Application(), KodeinAware {
    override val kodein: Kodein by Kodein.lazy {
        import(loginModule())
        import(splashModule())

        bind<Navigator>() with singleton { Navigator() }
        bind<UserManager>() with singleton { UserManager() }
    }

}