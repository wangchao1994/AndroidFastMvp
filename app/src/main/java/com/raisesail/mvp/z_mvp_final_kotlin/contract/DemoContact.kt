package com.raisesail.mvp.z_mvp_final_kotlin.contract

interface DemoContact {

    interface DemoView{
       fun operataionUI(dat:Any)
    }
    interface DemoPresenter{
        fun loadUI()
    }
    interface DemoModel{
        fun operationData(mOperationListener: OperationListener)
        interface OperationListener{
            fun completed(message: String)
        }
    }
}