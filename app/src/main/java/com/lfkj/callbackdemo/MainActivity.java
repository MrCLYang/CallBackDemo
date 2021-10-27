package com.lfkj.callbackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lfkj.callbackdemo.Test04.Listener;
import com.lfkj.callbackdemo.Test04.Operate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Operate op=new Operate();
        op.setListener(new Listener() {
            @Override
            public void update(String str) {
                System.out.println("监听器："+str);
            }
        });

        op.doSomething("我点击了一下");*/
//        *************************************
        String jsonStr = "{\n" +
                "\t\"id\": 84041462,\n" +
                "\t\"lastName\": \"小华\",\n" +
                "\t\"age\":32,\n" +
                "\t\"balance\":666255.32,\n" +
                "\t\"hobbyDesc\": {\n" +
                "\t\t\"subject\": \"数学\",\n" +
                "\t\t\"score\":25,\n" +
                "\t\t\"sport_desc\":\"跑步有益健康\"\n" +
                "\t}\n" +
                "\t\n" +
                "}";





    }
}