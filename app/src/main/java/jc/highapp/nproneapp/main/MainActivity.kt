package jc.highapp.nproneapp.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.navigation.Navigator
import jc.highapp.nproneapp.routers.login.LoginRouter
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.KodeinTrigger
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity(), KodeinAware {

    override val kodein: Kodein by lazy { (applicationContext as KodeinAware).kodein }

    private val navigator : Navigator by instance()
    private val router : LoginRouter by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator.bindRoot(this)
        router.startFlow()
    }

    override fun onDestroy() {
        super.onDestroy()
        navigator.unbindRoot()
    }
}
