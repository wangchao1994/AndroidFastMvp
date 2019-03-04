package com.raisesail.mvp.z_mvp_final.presenter;

import com.raisesail.mvp.z_mvp_final.base.BasePresenter;
import com.raisesail.mvp.z_mvp_final.contract.HomeContract;
import com.raisesail.mvp.z_mvp_final.model.HomeModel;

public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {

    protected HomeContract.Model mSimpleModel;
    public HomePresenter(){
        mSimpleModel = new HomeModel();
    }
    @Override
    public void homePresenter() {
        mSimpleModel.homeModel(new HomeContract.Model.ModelListener() {
            @Override
            public void completed(String message) {
                if (isViewAttached()){
                    getView().homeView(message);
                }
            }
        });
    }
}
