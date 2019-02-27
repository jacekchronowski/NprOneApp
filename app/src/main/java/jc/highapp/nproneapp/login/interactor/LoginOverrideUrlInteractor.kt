package jc.highapp.nproneapp.login.interactor

import jc.highapp.nproneapp.constants.Constants
import jc.highapp.nproneapp.login.model.LoginOverrideUrlResult
import okhttp3.HttpUrl

class LoginOverrideUrlInteractor {
    fun execute(url : String?) : LoginOverrideUrlResult {
        val baseUrl = url?.split("?")?.get(0)

        if(baseUrl != Constants.REDIRECT_URI) {
            return LoginOverrideUrlResult.LOGIN_OTHER_URL(url ?: "")
        }

        return HttpUrl.parse(url)?.let {
            if(it.queryParameter("error") != null) {
                LoginOverrideUrlResult.LOGIN_FAILURE(it.queryParameter("message"))
            } else {
                LoginOverrideUrlResult.LOGIN_SUCCESS
            }
        } ?: LoginOverrideUrlResult.LOGIN_FAILURE("")

    }
}