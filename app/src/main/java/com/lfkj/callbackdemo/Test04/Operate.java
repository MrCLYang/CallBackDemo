package com.lfkj.callbackdemo.Test04;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：
 */
public class Operate {
    private Listener mListener;
    public void setListener(Listener listener){
        mListener=listener;
    }

    public void doSomething(String  str){
        if(mListener!=null){
            mListener.update(str);
        }
    }


}
