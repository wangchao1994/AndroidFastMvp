package com.raisesail.mvp.mvpdemo.base;

import com.raisesail.mvp.mvpdemo.base.imp.IBasePresenter;

import java.lang.ref.WeakReference;

/**
 * 基类 presenter
 * @param <V>
 */
public class BasePresenter<V> implements IBasePresenter<V> {
    protected WeakReference<V> mWeakReference;
    /**
     * 页面开始构建
     * @param view
     */
    @Override
    public void registerView(V view) {
        mWeakReference = new WeakReference<>(view);
    }

    /**
     * 页面销毁
     */
    @Override
    public void unRegisterView() {
        if (mWeakReference != null){
            mWeakReference.clear();
            mWeakReference = null;
        }
    }

    /**
     * 判断页面是否销毁，接口返回设置数据前必须进行调用此方法来判断当前页面是否存在
     * @return
     */
    @Override
    public boolean isViewAttached() {
        return mWeakReference != null && mWeakReference.get() != null;
    }

    /**
     * 获取当前页面的引用
     * @return
     */
    @Override
    public V getView() {
        return mWeakReference != null ? mWeakReference.get() : null;
    }
}
