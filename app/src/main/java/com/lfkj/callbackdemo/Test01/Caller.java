package com.lfkj.callbackdemo.Test01;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：回调者，用于调用回调函数的类
 */
public class Caller {
    public void call(ICallBack cb){
        System.out.println(".......start");
        cb.callBack();
        System.out.println("........end");
    }



}
