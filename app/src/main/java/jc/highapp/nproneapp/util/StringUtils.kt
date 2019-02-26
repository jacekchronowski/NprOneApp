package jc.highapp.nproneapp.util

import java.net.URLDecoder

fun String.utf8Decode() : String{
    return URLDecoder.decode(this, "UTF-8")
}