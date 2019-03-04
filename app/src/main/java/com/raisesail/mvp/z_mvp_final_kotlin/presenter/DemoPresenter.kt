package com.raisesail.mvp.z_mvp_final_kotlin.presenter

import com.raisesail.mvp.z_mvp_final.base.BasePresenter
import com.raisesail.mvp.z_mvp_final_kotlin.contract.DemoContact
import com.raisesail.mvp.z_mvp_final_kotlin.model.DemoModel

class DemoPresenter : BasePresenter<DemoContact.DemoView>() ,DemoContact.DemoPresenter {
    protected lateinit var mModel: DemoModel
    fun DemoPresenter(){
        mModel = DemoModel()
    }
    override fun loadUI() {
        mModel.operationData(object : DemoContact.DemoModel.OperationListener{
            override fun completed(message: String) {
                if (isViewAttached){
                    view.operataionUI(message)
                }
            }

        })
    }
}