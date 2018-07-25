package com.home.ssq.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.home.ssq.R
import com.home.ssq.data.bean.Data
import com.home.ssq.util.getListBallNum

/**
 * @author Ting
 * @date 2018/7/25.
 */
class BallAdapter(val resLayout: Int, val list: MutableList<Data>)
    : BaseQuickAdapter<Data, BaseViewHolder>(resLayout, list) {
    override fun convert(helper: BaseViewHolder?, item: Data?) {
        val itemcode = item?.opencode
        if (itemcode != null) {
            val listBallNum = getListBallNum(itemcode)
            if (helper != null) {
                helper.setText(R.id.mOpenDate, "开奖日期:${item.opentime}")
                helper.setText(R.id.OneRedTv, listBallNum[0])
                helper.setText(R.id.TwoRedTv, listBallNum[1])
                helper.setText(R.id.ThreeRedTv, listBallNum[2])
                helper.setText(R.id.FourRedTv, listBallNum[3])
                helper.setText(R.id.FiveRedTv, listBallNum[4])
                helper.setText(R.id.SixRedTv, listBallNum[5])
                helper.setText(R.id.OneBlueTv, listBallNum[6])
            }
        }

    }
}