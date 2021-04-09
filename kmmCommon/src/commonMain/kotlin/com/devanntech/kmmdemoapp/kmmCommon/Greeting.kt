package com.devanntech.kmmdemoapp.kmmCommon


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
