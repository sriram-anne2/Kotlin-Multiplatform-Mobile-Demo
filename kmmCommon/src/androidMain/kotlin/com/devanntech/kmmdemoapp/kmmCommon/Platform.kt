package com.devanntech.kmmdemoapp.kmmCommon

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}