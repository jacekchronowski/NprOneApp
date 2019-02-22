package jc.highapp.nproneapp.login

import jc.highapp.nproneapp.BuildConfig
import jc.highapp.nproneapp.Constants
import okhttp3.HttpUrl

class LoginWebPageResolver {

    fun resolveAddress() : String{

        return HttpUrl.Builder()
            .scheme("https")
            .host(Constants.AUTHORIZATION_API_BASE_URL)
            .addPathSegment(Constants.AUTHORIZE_REQUEST)
            .addQueryParameter(Constants.PARAM_CLIENT_ID, BuildConfig.APPLICATION_ID)
            .addQueryParameter(Constants.PARAM_REDIRECT_URI, Constants.REDIRECT_URI)
            .addQueryParameter(Constants.PARAM_RESPONSE_TYPE, Constants.RESPONSE_TYPE_CODE)
            .addQueryParameter(Constants.PARAM_SCOPE, SCOPE_LIST.joinToString(separator = ","))
            .addQueryParameter(Constants.PARAM_STATE, BuildConfig.APPLICATION_SECRET)
            .build()
            .url()
            .toExternalForm()

    }

    companion object {

        val SCOPE_LIST : List<String> = listOf(Constants.SCOPE_IDENTITY_WRITE, Constants.SCOPE_IDENTITY_READ_ONLY)
    }
}