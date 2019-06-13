package com.raisesail.mvp.mvpdemo.presenter;

import com.android.mvpdemo.base.BasePresenter;
import com.android.mvpdemo.contract.MainContract;
import com.android.mvpdemo.model.MainModel;

import java.util.List;

/**
 * 逻辑业务处理
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter ,MainContract.Model.ModelListener{
    private MainContract.Model mMainModel;
    private List<String> currentDataList;
    public MainPresenter(){
        mMainModel = new MainModel();
    }
    @Override
    public void mainPresenter() {
        if (mMainModel != null){
            mMainModel.mainModel(this);
        }
    }

    @Override
    public void setLocalData(List<String> dataList) {
       if (isViewAttached()){
           getView().mainData(dataList);
       }
    }

    @Override
    public void completed(String message) {
        if (isViewAttached()){
            getView().mainView(message);
        }
    }
}
