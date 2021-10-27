package com.lfkj.callbackdemo.Test03;

import java.util.Observable;
import java.util.Observer;

/**
 * 作者：ycl
 * 时间：2021/10/26
 * 描述：
 */
public class WatcherDemo implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg.toString().equals("openWindows")){
            System.out.println("已经打开窗口");
        }
    }
}
