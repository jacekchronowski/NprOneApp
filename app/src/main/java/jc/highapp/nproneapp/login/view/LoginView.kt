package jc.highapp.nproneapp.login.view

import jc.highapp.nproneapp.mvp.BaseView

interface LoginView : BaseView {
    fun loadWebPage(address : String)
    fun initWebView()
}