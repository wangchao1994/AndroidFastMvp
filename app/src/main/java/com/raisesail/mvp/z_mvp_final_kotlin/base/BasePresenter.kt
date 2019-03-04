package com.raisesail.mvp.z_mvp_final_kotlin.base

import com.raisesail.mvp.z_mvp_final_kotlin.IPresenter
import com.raisesail.mvp.z_mvp_final_kotlin.IView
import java.lang.ref.WeakReference

open class BasePresenter<V : IView> : IPresenter<V> {

    protected var mWeakReference : WeakReference<V> ?= null

    override fun isAttachView(): Boolean {
        return false
    }

    override fun unRegisterView() {
        mWeakReference?.clear()
    }

    override fun registerView(view: V) {
        mWeakReference = WeakReference<V>(view)
    }

    fun getView():V?{
        return mWeakReference?.get()
    }
}