package com.lfkj.callbackdemo.Test02;

import com.lfkj.callbackdemo.Test02.EventObject;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：监听器接口
 */
public interface EventListener extends java.util.EventListener{
     //    事件处理
    public void handleEvent(EventObject event);
}
