package com.raisesail.mvp.z_mvp_final.base;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.raisesail.mvp.utils.AppManager;
import com.raisesail.mvp.z_mvp_final.IView;


public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IView {
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setStatusTextColor(true);
        bindView();
        AppManager.getAppManager().addActivity(this);
        initContentData(savedInstanceState);
    }

    protected abstract int getLayoutId();
    protected abstract void initContentData(Bundle savedInstanceState);

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
    @Override
    public void bindView() {
        mPresenter = createPresenter();
        if (mPresenter != null){
            mPresenter.registerView(this);
        }
    }

    protected abstract P createPresenter();

    @Override
    public void unBindView() {
        if (mPresenter != null){
            mPresenter.unRegisterView();
        }
        AppManager.getAppManager().removeActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unBindView();
    }
}
