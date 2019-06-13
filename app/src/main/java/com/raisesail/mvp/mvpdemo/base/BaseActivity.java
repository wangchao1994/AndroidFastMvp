package com.raisesail.mvp.mvpdemo.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.mvpdemo.R;
import com.android.mvpdemo.base.imp.IBaseView;
import com.android.mvpdemo.utils.AppManager;
import com.android.mvpdemo.utils.GlobalHandler;
import com.android.mvpdemo.utils.PreferencesUtils;
import com.android.mvpdemo.utils.StatusBarUtil;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView ,GlobalHandler.HandleMsgListener {
    protected P mPresenter;
    protected Context mContext;
    protected GlobalHandler mGlobalHandler;
    protected PreferencesUtils mPreferencesUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(getLayoutId());
        setStatusTextColor(true);
        bindView();
        initContentData(savedInstanceState);
        mGlobalHandler = GlobalHandler.getInstance();
        mGlobalHandler.setHandleMsgListener(this);
        mPreferencesUtils = new PreferencesUtils(this);
        AppManager.getAppManager().addActivity(this);
    }

    protected abstract void initContentData(Bundle savedInstanceState);
    protected abstract int getLayoutId();

    @Override
    public Context getViewContext() {
        return mContext;
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
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unBindView();
        AppManager.getAppManager().removeActivity(this);
    }

    /**
     * 设置当前状态栏字体颜色
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
        //设置透明状态栏
        StatusBarUtil.setStatusColor(getWindow(), ContextCompat.getColor(this, R.color.colorPrimary), 1f);
    }
}
