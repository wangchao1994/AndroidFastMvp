package com.raisesail.mvp.mvpdemo.model;

import com.android.mvpdemo.base.imp.IBaseModel;
import com.android.mvpdemo.contract.MainContract;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据提供
 * 获取数据
 */
public class MainModel extends IBaseModel implements MainContract.Model {
    private List<String> mCurrentList;
    public List<String> getCurrentDataList(){
        mCurrentList = new ArrayList<>();
        mCurrentList.add("A");
        mCurrentList.add("B");
        mCurrentList.add("C");
        return mCurrentList;
    }
    @Override
    public void mainModel(ModelListener modelListener) {
        if (modelListener != null){
            modelListener.completed("complete-->");
            modelListener.setLocalData(getCurrentDataList());
        }
    }
}
