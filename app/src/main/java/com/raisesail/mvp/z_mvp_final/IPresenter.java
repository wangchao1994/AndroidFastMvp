package com.raisesail.mvp.z_mvp_final;

/**
 * 交互类基类
 */
public interface IPresenter<V> {
    void registerView(V view);
    void unRegisterView();
    boolean isViewAttached();
    V getView();
}
