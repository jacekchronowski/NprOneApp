package jc.highapp.nproneapp.login.view

import android.annotation.TargetApi
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.login.presenter.LoginPresenter
import jc.highapp.nproneapp.mvp.BaseFragment
import jc.highapp.nproneapp.util.Constants
import kotlinx.android.synthetic.main.login_fragment_layout.*
import org.kodein.di.generic.instance


class LoginFragment : BaseFragment<LoginView, LoginPresenter>(), LoginView {

    override val layoutResId: Int = R.layout.login_fragment_layout
    override val presenter: LoginPresenter by instance()

    override fun loadWebPage(address: String) {
        login_web_page.loadUrl(address)
    }

    override fun initWebView() {

        login_web_page.settings.javaScriptEnabled = true
        login_web_page.settings.userAgentString = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36"

        login_web_page.webViewClient = object : WebViewClient() {

            override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                presenter.onOverrideUrlLoading(url)
                return false
            }

            @TargetApi(21)
            override fun shouldOverrideUrlLoading(view: WebView,  request : WebResourceRequest): Boolean {
                presenter.onOverrideUrlLoading(request.url.toString())
                return false
            }


        }
    }
}