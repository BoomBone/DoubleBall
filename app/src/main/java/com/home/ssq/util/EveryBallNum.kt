package com.home.ssq.util

/**
 * @author Ting
 * @date 2018/7/25.
 */

fun getListBallNum(num: String): MutableList<String> {
    val list = arrayListOf<String>()
    val listOne = num.split("+")
    val startString = listOne[0]
    val listTwo = startString.split(",")
    for (startNum in listTwo) {
        list.add(startNum)
    }
    list.add(listOne[1])
    return list
}