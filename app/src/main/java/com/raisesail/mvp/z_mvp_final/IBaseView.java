package com.raisesail.mvp.z_mvp_final;

import android.content.Context;

/**
 * View接口基类
 */
public interface IBaseView {
    Context getViewContext();
    void bindView();
    void unBindView();
}
