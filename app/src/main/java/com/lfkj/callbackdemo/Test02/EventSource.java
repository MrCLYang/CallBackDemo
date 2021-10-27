package com.lfkj.callbackdemo.Test02;

import java.util.Vector;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：事件源，事件源是事件对象的入口，包含监听器的注册、撤销、通知
 */
public class EventSource {
//    监听器列表，监听器的注册加入此列表
    private Vector<EventListener> ListenerList=new Vector<>();
//    注册监听器
    public void addListener(EventListener eventListener){
        ListenerList.add(eventListener);
    }
//    撤销监听器
    public void removeListener(EventListener eventListener){
        ListenerList.remove(eventListener);
    }
//    接收外部事件
    public void notifyListenerEvents(EventObject event){
        for (EventListener eventListener:ListenerList
             ) {
            eventListener.handleEvent(event);
        }
    }

}
