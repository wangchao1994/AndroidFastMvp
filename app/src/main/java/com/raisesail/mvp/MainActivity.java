package com.raisesail.mvp;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.raisesail.mvp.common.main.MainPresenter;
import com.raisesail.mvp.common.base.BaseActivity;
import com.raisesail.mvp.mvp.contract.IMainContract;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainContract.View{

    private TextView textView;
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void initContentData(Bundle savedInstanceState) {
        textView = findViewById(R.id.tv_message);
    }

    @Override
    protected void initViewListener() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void setNetPictureUrl(String url) {
        Log.d("activity_main","url--------------->"+url);
    }
}
