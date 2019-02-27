package jc.highapp.nproneapp.login.model

sealed class LoginOverrideUrlResult {
    object LOGIN_SUCCESS : LoginOverrideUrlResult()
    class LOGIN_FAILURE(val errorMessage : String?) : LoginOverrideUrlResult()
    class LOGIN_OTHER_URL(val url : String) : LoginOverrideUrlResult()
}