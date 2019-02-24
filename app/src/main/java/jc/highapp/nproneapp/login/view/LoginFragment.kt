package jc.highapp.nproneapp.login.view

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.login.presenter.LoginPresenter
import jc.highapp.nproneapp.mvp.BaseFragment
import kotlinx.android.synthetic.main.login_fragment_layout.*
import org.kodein.di.generic.instance


class LoginFragment : BaseFragment<LoginView, LoginPresenter>(), LoginView {

    override val layoutResId: Int = R.layout.login_fragment_layout
    override val presenter: LoginPresenter by instance()

    override fun loadWebPage(address: String) {
        login_web_page.loadUrl(address)
    }

    override fun initWebView() {

        login_web_page.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView,  request : WebResourceRequest): Boolean {
                presenter.onLoginSuccess()
                return false
            }
        }
    }
}