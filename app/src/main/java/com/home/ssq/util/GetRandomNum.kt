package com.home.ssq.util

import java.util.*

/**
 * @author Ting
 * @date 2018/7/25.
 */
fun getRedNum():Int{
    val a=Random().nextInt(33)
    return a+1
}

fun getBlueNum():Int{
    val a=Random().nextInt(16)
    return a+1
}