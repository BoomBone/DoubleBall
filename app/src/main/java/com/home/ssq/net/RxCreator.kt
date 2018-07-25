package com.home.ssq.net

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author Ting
 * @date 2018/7/25.
 */
object RxCreator {

    fun getRxService() = RxServiceHolder.REST_SERVICE

    /**
     * 构建OkHttp
     */
    private object OkHttpHolder {
        private val TIME_OUT = 60
        private val BUILDER = OkHttpClient.Builder()

        val OKHTTP_CLIENT = BUILDER
                .connectTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
                .build()
    }

    /**
     * 构建全局Retrofit客户端
     */
    private object RetrofitHolder {
        private val BASE_URL = "http://f.apiplus.net"
        val RETROFIT_CLIENT = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpHolder.OKHTTP_CLIENT)
                .build()
    }

    /**
     * RxService接口
     */
    private object RxServiceHolder {
        val REST_SERVICE = RetrofitHolder.RETROFIT_CLIENT.create(RxService::class.java)
    }
}