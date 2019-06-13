package com.raisesail.mvp.mvpdemo.base.imp;

/**
 * 基础 presenter
 * @param <V>
 */
public interface IBasePresenter<V> {
    void registerView(V view);
    void unRegisterView();
    boolean isViewAttached();
    V getView();
}
