package com.home.ssq.data.bean

/**
 * @author Ting
 * @date 2018/7/25.
 */

data class ResultBean(
		val rows: Int,
		val code: String,
		val info: String,
		val data: MutableList<Data>
)

data class Data(
		val expect: String,
		val opencode: String,
		val opentime: String,
		val opentimestamp: Int
)