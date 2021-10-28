package com.lfkj.callbackdemo.Test07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lfkj.callbackdemo.R;

import java.util.ArrayList;
import java.util.List;

public class Test07Activity extends AppCompatActivity implements Observable{


    private List<Observer> personList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test07);
        Observer boy1=new Boy("张飞");
        Observer boy2=new Boy("关羽");
        Observer girl1=new Girl("貂蝉");
        this.add(boy1);
        this.add(boy2);
        this.add(girl1);
        this.notify("快递到了请下楼取快递");

    }

    @Override
    public void add(Observer observer) {
        personList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        personList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:personList
             ) {
            observer.update(message);
        }
    }
}