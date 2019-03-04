package com.raisesail.mvp.z_mvp_final_kotlin.model

import com.raisesail.mvp.mvp.model.BaseModel
import com.raisesail.mvp.z_mvp_final_kotlin.contract.DemoContact

class DemoModel : BaseModel(),DemoContact.DemoModel{

    override fun operationData(mOperationListener: DemoContact.DemoModel.OperationListener) {
        mOperationListener.completed("complete ----->")
    }

}