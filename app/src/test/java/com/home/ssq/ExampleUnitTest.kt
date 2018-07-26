package com.home.ssq

import com.home.ssq.util.getBlueNum
import com.home.ssq.util.getListBallNum
import com.home.ssq.util.getRedNum
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
        val c = "20,29,14,22,3,26+8"
        val a = "06,12,14,20,22,24+09"
        val listBallNum = getListBallNum(c)
        val b = listBallNum.toString()
        print(b)
    }

    @Test
    fun getRandom() {
        val r = getRandomBString()
        print(r)
    }

    private fun getRandomBString(): String {
        val ballNum = StringBuilder()
        val setList = mutableSetOf<Int>()
        while (true) {
            val randomNum = getRedNum()
            setList.add(randomNum)
            if (setList.size == 6) {
                break
            }
        }
        setList.forEach {
            ballNum.append("$it,")
        }
        val b = getBlueNum()
        val c = ballNum.append(b).toString()
        return c
    }
}
