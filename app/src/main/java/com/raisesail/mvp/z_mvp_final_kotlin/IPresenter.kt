package com.raisesail.mvp.z_mvp_final_kotlin

interface IPresenter<in V> {
    /**
     * 注册View
     */
    fun registerView(view : V)
    /**
     * 接绑View
     */
    fun unRegisterView()
    fun isAttachView():Boolean
}