package com.raisesail.mvp.mvp.contract;

public class IMainContract {
    public interface Presenter{
        void getMessage();
    }
    public interface View{
        void setMessage();
    }
}
