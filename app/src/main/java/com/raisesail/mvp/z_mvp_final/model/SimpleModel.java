package com.raisesail.mvp.z_mvp_final.model;

import com.raisesail.mvp.z_mvp_final.IModel;
import com.raisesail.mvp.z_mvp_final.contract.MainContract;

/**
 * 数据访问回传
 */
public class SimpleModel extends IModel implements MainContract.Model {

    @Override
    public void simpleModel(ModelListener modelListener) {
        if (modelListener != null){
            modelListener.completed("model complete--------->");
        }
    }
}
