package com.raisesail.mvp.common.main;

import android.util.Log;

import com.raisesail.mvp.common.config.GlobalConfig;
import com.raisesail.mvp.mvp.model.BaseModel;

/**
 * 实体类数据处理
 */
public class MainModel extends BaseModel {

    public String getNetPitcureUrl(){
        Log.d("wang_message","main_model----------->main_message-------->");
         return GlobalConfig.URL;
    }
}
