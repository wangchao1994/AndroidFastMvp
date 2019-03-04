package com.raisesail.mvp.z_mvp_final.contract;

//link
public interface HomeContract {

    interface View{
        void homeView(String message);
    }

    interface Presenter{
        void homePresenter();
    }

    interface Model{
        void homeModel(ModelListener modelListener);
        interface ModelListener{
            void completed(String message);
        }
    }
}
