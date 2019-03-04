package com.raisesail.mvp.common.main;

import com.raisesail.mvp.mvp.contract.IMainContract;
import com.raisesail.mvp.mvp.presenter.BasePresenter;

/**
 * View Model 交互类
 */
public class MainPresenter extends BasePresenter<IMainContract.View> implements IMainContract.Presenter {

    private MainModel mMainModel;
    public MainPresenter(){
        mMainModel = new MainModel();
    }

    @Override
    public void getNetPictureUrl() {
        if (!isViewAttached())return;
        String netPitcureUrl = mMainModel.getNetPitcureUrl();
        if (!"".equals(netPitcureUrl)&& netPitcureUrl != null ){
            getView().setNetPictureUrl(netPitcureUrl);
        }
    }
}
