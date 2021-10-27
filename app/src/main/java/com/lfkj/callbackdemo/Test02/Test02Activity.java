package com.lfkj.callbackdemo.Test02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lfkj.callbackdemo.R;
/*
*
* 到这里你应该非常清楚的了解，什么是事件监听器模式了吧。 那么哪里是回调接口，哪里是回调者，对！
* EventListener是一个回调接口类，handleEvent是一个回调函数接口，通过回调模型，EventSource 事件源便可回调具体监听器动作。
* */

public class Test02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test02);

        EventSource eventSource=new EventSource();
        eventSource.addListener(new EventListener() {
            @Override
            public void handleEvent(EventObject event) {
                event.doEvent();
                if(event.getSource().equals("closeWindows")){
                    System.out.println("doClose");
                }

            }
        });
         /*
         * 传入openWindows事件，通知listener，事件监听器，
         对open事件感兴趣的listener将会执行
         **/
        eventSource.notifyListenerEvents(new EventObject("openWindows"));
    }
}