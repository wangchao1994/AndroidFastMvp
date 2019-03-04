package com.raisesail.mvp.z_mvp_final.model;

import com.raisesail.mvp.z_mvp_final.IBaseModel;
import com.raisesail.mvp.z_mvp_final.contract.HomeContract;

/**
 * 数据访问回传
 */
public class HomeModel extends IBaseModel implements HomeContract.Model {

    @Override
    public void homeModel(ModelListener modelListener) {
        if (modelListener != null){
            modelListener.completed("model complete--------->");
        }
    }
}
