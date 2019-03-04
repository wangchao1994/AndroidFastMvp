package com.raisesail.mvp.z_mvp_final.ui;

import android.os.Bundle;
import android.os.Message;
import android.widget.Toast;

import com.raisesail.mvp.R;
import com.raisesail.mvp.z_mvp_final.base.BaseActivity;
import com.raisesail.mvp.z_mvp_final.contract.HomeContract;
import com.raisesail.mvp.z_mvp_final.presenter.HomePresenter;

public class HomeActivity extends BaseActivity<HomePresenter> implements HomeContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_simple;
    }

    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initContentData(Bundle savedInstanceState) {
        mPresenter.homePresenter();
    }

    @Override
    public void homeView(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void handleMsg(Message msg) {

    }
}
