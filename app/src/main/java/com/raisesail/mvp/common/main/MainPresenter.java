package com.raisesail.mvp.common.main;

import com.raisesail.mvp.mvp.contract.IMainContract;
import com.raisesail.mvp.mvp.presenter.BasePresenter;

/**
 * 主页面处理
 */
public class MainPresenter extends BasePresenter<IMainContract.View> implements IMainContract.Presenter {
    private MainModel mMainModel;
    public MainPresenter(){
        mMainModel = new MainModel();
    }

    @Override
    public void getMessage() {

    }
}
