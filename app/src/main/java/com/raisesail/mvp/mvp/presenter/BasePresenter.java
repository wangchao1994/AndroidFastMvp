package com.raisesail.mvp.mvp.presenter;


import java.lang.ref.WeakReference;

public abstract class BasePresenter<V> {

    protected WeakReference<V> mWeakReference;
    /**
     * 界面构建
     */
    public void attachView(V view){
        mWeakReference = new WeakReference<>(view);
    }

    /**
     * 获取页面的引用
     */
    public V getView(){
        return mWeakReference != null ? mWeakReference.get() : null;
    }

    /**
     * 判断页面是否销毁，接口返回设置数据必须调用此方法判断界面是否还存在
     */
    public boolean isViewAttached(){
        return mWeakReference != null && mWeakReference.get() != null;
    }

    /**
     * 页面销毁
     */
    public void detachView(){
        if (mWeakReference != null){
            mWeakReference.clear();
            mWeakReference = null;
        }
    }
}
