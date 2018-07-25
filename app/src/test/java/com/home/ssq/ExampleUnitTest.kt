package com.home.ssq

import com.home.ssq.util.getListBallNum
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun getnum() {
        val a = "06,12,14,20,22,24+09"
        val listBallNum = getListBallNum(a)
        val b =listBallNum.toString()
        print(b)
    }
}
