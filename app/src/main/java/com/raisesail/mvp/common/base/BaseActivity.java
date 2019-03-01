package com.raisesail.mvp.common.base;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.raisesail.mvp.mvp.presenter.BasePresenter;
import com.raisesail.mvp.utils.AppManager;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusTextColor(true);
        AppManager.getAppManager().addActivity(this);
        setContentView(getLayoutId());
        mPresenter = createPresenter();
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
        initContentData(savedInstanceState);
        initViewListener();
    }

    /**
     * 设置状态栏字体颜色
     * @param isDark
     */
    private void setStatusTextColor(boolean isDark) {
        if (isDark){
            //黑色字体
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M){
                getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            }
        }else{
            //白色字体
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        }
    }

    protected abstract int getLayoutId();
    protected abstract P createPresenter();
    protected abstract void initContentData(Bundle savedInstanceState);
    protected abstract void initViewListener();


    @Override
    protected void onDestroy() {
        if (mPresenter != null){
            mPresenter.detachView();
        }
        AppManager.getAppManager().removeActivity(this);
        super.onDestroy();
    }

}
