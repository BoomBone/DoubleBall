package com.home.ssq.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.home.ssq.R
import com.home.ssq.data.bean.Data
import com.home.ssq.data.bean.ResultBean
import com.home.ssq.ext.execute
import com.home.ssq.net.RxCreator
import com.home.ssq.ui.adapter.BallAdapter
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        initData()
    }

    private fun initData() {
        RxCreator.getRxService()
                .get("/ssq-10.json")
                .execute(object : Observer<ResultBean> {
                    override fun onComplete() {

                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(t: ResultBean) {
                        Log.e("main", t.toString())
                        val data = t.data
                        initView(data)
                    }

                    override fun onError(e: Throwable) {
                    }

                })
    }

    private fun initView(data: MutableList<Data>) {
        val adapter = BallAdapter(R.layout.app_item_card, data)
        mHistoryRv.layoutManager = LinearLayoutManager(this)
        mHistoryRv.adapter = adapter
    }
}
