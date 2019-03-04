package com.raisesail.mvp.z_mvp_final.presenter;

import com.raisesail.mvp.z_mvp_final.base.BasePresenter;
import com.raisesail.mvp.z_mvp_final.contract.MainContract;
import com.raisesail.mvp.z_mvp_final.model.SimpleModel;

public class SimplePresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    protected MainContract.Model mSimpleModel;
    public SimplePresenter(){
        mSimpleModel = new SimpleModel();
    }
    @Override
    public void simplePresenter() {
        mSimpleModel.simpleModel(new MainContract.Model.ModelListener() {
            @Override
            public void completed(String message) {
                if (isViewAttached()){
                    getView().simpleView(message);
                }
            }
        });
    }
}
