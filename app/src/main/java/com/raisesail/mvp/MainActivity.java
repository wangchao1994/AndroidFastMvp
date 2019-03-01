package com.raisesail.mvp;


import android.os.Bundle;
import com.raisesail.mvp.common.main.MainPresenter;
import com.raisesail.mvp.common.base.BaseActivity;
import com.raisesail.mvp.mvp.presenter.BasePresenter;

public class MainActivity extends BaseActivity {

    private MainPresenter mMainPresenter;

    @Override
    protected void initLayoutContent(Bundle savedInstanceState) {

    }

    @Override
    protected BasePresenter createPresenter() {
        mMainPresenter = new MainPresenter();
        return mMainPresenter;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
