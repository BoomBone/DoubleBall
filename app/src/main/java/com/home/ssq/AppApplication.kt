package com.home.ssq

import android.app.Application
import com.tencent.bugly.Bugly

/**
 * @author Ting
 * @date 2018/7/26
 */
class AppApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        Bugly.init(applicationContext, "1fa0555ef8", false);
    }
}