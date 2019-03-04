package com.raisesail.mvp.z_mvp_final;

import android.app.Application;

public class GlobalApplication extends Application {

    private static GlobalApplication mGlobalApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        mGlobalApplication = this;
    }
    public static synchronized GlobalApplication getInstance(){
        return mGlobalApplication;
    }
}
