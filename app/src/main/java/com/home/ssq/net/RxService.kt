package com.home.ssq.net

import com.home.ssq.data.bean.ResultBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * @author Ting
 * @date 2018/7/25.
 */
interface RxService {
    @GET
    fun get(@Url url: String): Observable<ResultBean>
}