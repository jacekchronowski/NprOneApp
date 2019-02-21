package jc.highapp.nproneapp.login

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.main.BaseFragment
import kotlinx.android.synthetic.main.login_fragment_layout.*
import org.kodein.di.generic.instance


class LoginFragment : BaseFragment<LoginView, LoginPresenter>(), LoginView {

    override val layoutResId: Int = R.layout.login_fragment_layout
    override val presenter: LoginPresenter by getKodein().instance()

    override fun loadWebPage(address: String) {
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