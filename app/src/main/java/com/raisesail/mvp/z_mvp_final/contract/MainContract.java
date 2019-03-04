package com.raisesail.mvp.z_mvp_final.contract;

//link
public interface MainContract {

    interface View{
        void simpleView(String message);
    }

    interface Presenter{
        void simplePresenter();
    }

    interface Model{
        void simpleModel(ModelListener modelListener);
        interface ModelListener{
            void completed(String message);
        }
    }
}
