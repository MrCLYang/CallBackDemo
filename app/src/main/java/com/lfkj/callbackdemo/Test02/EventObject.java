package com.lfkj.callbackdemo.Test02;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：事件对象
 */
public class EventObject extends java.util.EventObject {

    private static final long serialVersionUID=1L;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventObject(Object source) {
        super(source);
    }

    public void doEvent(){
        System.out.println("通知一个事件源source:"+this.getSource());
    }
}
