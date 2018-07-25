package com.home.ssq.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.home.ssq.data.bean.Data

/**
 * @author Ting
 * @date 2018/7/25.
 */
class BallAdapter(val resLayout:Int,val list:MutableList<Data>)
    :BaseQuickAdapter<Data,BaseViewHolder>(resLayout,list) {
    override fun convert(helper: BaseViewHolder?, item: Data?) {

    }
}