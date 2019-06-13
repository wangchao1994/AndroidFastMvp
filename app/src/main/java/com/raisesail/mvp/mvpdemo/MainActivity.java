package com.raisesail.mvp.mvpdemo;

import android.os.Message;
import android.os.Bundle;
import com.android.mvpdemo.base.BaseActivity;
import com.android.mvpdemo.contract.MainContract;
import com.android.mvpdemo.presenter.MainPresenter;
import com.android.mvpdemo.utils.LogUtils;

import java.util.List;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private List<String> currentData;

    @Override
    protected void initContentData(Bundle savedInstanceState) {
        if (mPresenter != null){
            mPresenter.mainPresenter();
        }

    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void handleMsg(Message msg) {
    }

    @Override
    public void mainView(String message) {
        LogUtils.d("mvc_demo","message-mainView----->"+message);
    }

    @Override
    public void mainData(List<String> dataList) {
        LogUtils.d("mvc_demo","dataList---mainData--->"+dataList.size());
    }
}
