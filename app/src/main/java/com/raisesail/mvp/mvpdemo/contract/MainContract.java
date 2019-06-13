package com.raisesail.mvp.mvpdemo.contract;

import java.util.List;

/**
 * Contract 外层接口
 */
public interface MainContract {

    interface View{
        void mainView(String message);
        void mainData(List<String> dataList);
    }

    interface Presenter{
        void mainPresenter();
    }

    interface Model{
        void mainModel(ModelListener modelListener);
        interface ModelListener{
            void setLocalData(List<String> dataList);
            void completed(String message);
        }
    }
}
