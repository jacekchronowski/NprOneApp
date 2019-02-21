package jc.highapp.nproneapp.login

import jc.highapp.nproneapp.main.BaseView

interface LoginView : BaseView {
    fun loadWebPage(address : String)
    fun initWebView()
}