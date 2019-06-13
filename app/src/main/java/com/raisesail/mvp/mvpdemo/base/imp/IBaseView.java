package com.raisesail.mvp.mvpdemo.base.imp;

import android.content.Context;

/**
 * 基类 View
 */
public interface IBaseView {
    Context getViewContext();
    void bindView();
    void unBindView();
}
