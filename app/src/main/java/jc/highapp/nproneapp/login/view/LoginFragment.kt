package jc.highapp.nproneapp.login.view

import android.annotation.TargetApi
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import jc.highapp.nproneapp.R
import jc.highapp.nproneapp.animations.startFadeOutAnimation
import jc.highapp.nproneapp.login.presenter.LoginPresenter
import jc.highapp.nproneapp.mvp.BaseFragment
import jc.highapp.nproneapp.constants.Constants
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
        login_web_page.settings.userAgentString = Constants.WEBVIEW_USER_AGENT

        login_web_page.webViewClient = object : WebViewClient() {

            override fun onPageFinished(view: WebView?, url: String?) {
                presenter.onLoginPageLoadingFinished()
            }

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

    override fun startSplashHideAnimation() {
        splash_loading_view.startFadeOutAnimation(resources.getInteger(R.integer.splash_view_fade_out_animation_duration).toLong())
    }
}