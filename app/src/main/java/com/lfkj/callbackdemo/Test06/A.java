package com.lfkj.callbackdemo.Test06;

/**
 * 作者：ycl
 * 时间：2021/10/27
 * 描述：
 * 2个类，A类和B类。A类含有1个接口、1个接口变量、（可能含有）1个为接口变量赋值的方法以及1个会使用接口变量的“地方”
 * ;B类实现A中的接口，（可能）含有1个A类实例的引用，并且（可能用A类中为接口变量赋值的方法）将“自己”传递给A类的接口变量。
 */
public class A {
     //    一个接口变量
    private Callback mCallback;
    //     一个回调
    public interface Callback{
        void doSomething();
    }
    //一个给接口变量赋值的方法
    public void setmCallback(Callback callback){
        mCallback=callback;
    }
    //一个使用接口变量的地方
    public void onExecute(){
        mCallback.doSomething();
    }
}
