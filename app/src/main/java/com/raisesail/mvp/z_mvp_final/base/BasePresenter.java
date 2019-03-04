package com.raisesail.mvp.z_mvp_final.base;

import com.raisesail.mvp.z_mvp_final.IBasePresenter;

import java.lang.ref.WeakReference;

public class BasePresenter<V> implements IBasePresenter<V> {

    protected WeakReference<V> mWeakReference;
    /**
     * 页面构建
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
     * 获取页面的引用
     */
    @Override
    public V getView(){
        return mWeakReference != null ? mWeakReference.get() : null;
    }

    /**
     * 判断页面是否销毁，接口返回设置数据必须调用此方法判断界面是否还存在
     */
    @Override
    public boolean isViewAttached(){
        return mWeakReference != null && mWeakReference.get()!= null;
    }

}
