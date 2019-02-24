package jc.highapp.nproneapp.splash.view

import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.mvp.BaseFragment
import jc.highapp.nproneapp.splash.presenter.SplashPresenter
import org.kodein.di.generic.instance

class SplashFragment : BaseFragment<SplashView, SplashPresenter>() {
    override val layoutResId: Int = R.layout.splash_fragment_layout
    override val presenter: SplashPresenter by instance()
}