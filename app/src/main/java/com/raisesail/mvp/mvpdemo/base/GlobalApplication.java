package com.raisesail.mvp.mvpdemo.base;

import android.app.Application;

public class GlobalApplication extends Application {
    private static GlobalApplication globalApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        globalApplication = this;
    }
    public static synchronized GlobalApplication getInstance(){
        return globalApplication;
    }
}
