package com.raisesail.mvp.z_mvp_final_kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ffo.util.log.LogUtil
import com.raisesail.mvp.z_mvp_final_kotlin.IView

open abstract class BaseActivity<P : BasePresenter<IView>> : AppCompatActivity(),IView {

    companion object {
        val log:LogUtil = LogUtil(BaseActivity::class.simpleName.toString())
    }

    protected lateinit var mPresenter: P
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView()
    }

    override fun onDestroy() {
        super.onDestroy()
        unBindView()
    }

    override fun bindView() {
        mPresenter = createPresenter()
        mPresenter.registerView(this)
    }

    abstract fun createPresenter(): P

    override fun unBindView() {
        mPresenter.registerView(this)
    }
}