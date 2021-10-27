package com.lfkj.callbackdemo.Test06;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.lfkj.callbackdemo.R;

/**
 * 作者：ycl
 * 时间：2021/10/27
 * 描述：
 * A类中有一个接口变量和接口。
 * B类实现A类的接口（这个接口就是所谓的回调接口）。
 * A类的接口变量会（通过过某种方法）获得靠B类实现的接口。
 * A类在一个适当的时机“使用”这个接口变量，即调用接口中的函数（这个函数就是所谓的回调函数）。
 *
 *
 *
 *
 * 通过指针的原始定义：定义：回调函数就是一个通过函数指针调用的函数。如果你把函数的指针（地址）作为参数传递给另一个函数，当这个指针被用来调用其所指向的函数时，我们就说这是回调函数。回调函数不是由该函数的实现方直接调用，而是在特定的事件或条件发生时由另外的一方调用的，用于对该事件或条件进行响应。
 * 机制：
 * ⑴定义一个回调函数；
 * ⑵提供函数实现的一方在初始化的时候，将回调函数的函数指针注册给调用者；
 * ⑶当特定的事件或条件发生的时候，调用者使用函数指针调用回调函数对事件进行处理。
 * 原文链接：https://blog.csdn.net/chengkun_123/article/details/51318379
 */
public class B extends Activity implements A.Callback {
    private static final String TAG="BBBBBBB";
    //A类的实例的引用
    private A mA;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TODO 写法一
      /*  A mA=new A();
        mA.setmCallback(new A.Callback() {
            @Override
            public void doSomething() {
                Log.d(TAG, "doSomething: "+"杨成雷");
            }
        });

        mA.onExecute();*/
    mA=new A();
    //B类将自己（实际上是接口的实现）传给A类实例的接口变量
    mA.setmCallback(this);
    //实例实现mA的方法，或者在A中实现该方法
    mA.onExecute();

    }

    //B类实现了A类的接口
    @Override
    public void doSomething() {
        Log.d(TAG, "doSomething: "+"杨成雷");
    }



}
