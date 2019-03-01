package com.raisesail.mvp.mvp.contract;

public interface IMainContract {

    interface Presenter{
        void getNetPictureUrl();
    }

    interface View {
        void setNetPictureUrl(String url);
    }
}
