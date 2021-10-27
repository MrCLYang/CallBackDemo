package com.lfkj.callbackdemo.Test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lfkj.callbackdemo.R;

import java.util.Observable;
import java.util.Observer;

public class Test03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test03);
        Watched watched=new Watched();
        WatcherDemo watcherDemo=new WatcherDemo();
        watched.addObserver(watcherDemo);
        watched.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if(arg.toString().equals("closeWindows")){
                    System.out.println("已经关闭窗口");
                }
            }
        });
        //触发打开窗口事件，通知观察者
        watched.notifyObservers("openWindows");
        //触发关闭窗口事件，通知观察者
        watched.notifyObservers("closeWindows");
    }
}