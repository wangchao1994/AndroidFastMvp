package com.raisesail.mvp.mvpdemo.utils;

import android.os.Handler;
import android.os.Message;

/**
 * detail: Handler 工具类, 默认开启一个 Handler，方便在各个地方随时执行主线程任务
 */
public final class GlobalHandler extends Handler {

    private HandleMsgListener listener;
    private String Tag = GlobalHandler.class.getSimpleName();
    //使用单例模式创建GlobalHandler
    private GlobalHandler(){
        LogUtils.e(Tag,"GlobalHandler创建");
    }
    private static class Holder{
        private static final GlobalHandler HANDLER = new GlobalHandler();
    }

    public static GlobalHandler getInstance(){
        return Holder.HANDLER;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        if (getHandleMsgListener() != null){
            getHandleMsgListener().handleMsg(msg);
        }else {
            LogUtils.e(Tag,"请传入HandleMsgListener对象");
        }
    }

    public interface HandleMsgListener{
        void handleMsg(Message msg);
    }

    public void setHandleMsgListener(HandleMsgListener listener){
        this.listener = listener;
    }

    private HandleMsgListener getHandleMsgListener(){
        return listener;
    }

}
