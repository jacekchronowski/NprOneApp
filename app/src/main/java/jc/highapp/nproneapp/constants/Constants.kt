package jc.highapp.nproneapp.constants

class Constants {

    companion object {

        const val AUTHORIZATION_API_BASE_URL = "authorization.api.npr.org"
        const val AUTHORIZE_REQUEST = "v2/authorize"
        const val PARAM_CLIENT_ID: String = "client_id"
        const val PARAM_REDIRECT_URI: String = "redirect_uri"
        const val PARAM_RESPONSE_TYPE: String = "response_type"
        const val PARAM_SCOPE: String = "scope"
        const val PARAM_STATE: String = "state"
        const val RESPONSE_TYPE_CODE: String = "code"
        const val REDIRECT_URI: String = "https://www.example.com"
        const val SCOPE_IDENTITY_WRITE: String = "identity.write"
        const val SCOPE_IDENTITY_READ_ONLY: String = "identity.readonly"
        const val SCOPE_LISTENING_READ_ONLY: String = "listening.readonly"
        const val SCOPE_LISTENING_WRITE: String = "listening.write"
        const val SCOPE_LOCALACTIVATION: String = "localactivation"
        const val WEBVIEW_USER_AGENT: String = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36"

    }
}