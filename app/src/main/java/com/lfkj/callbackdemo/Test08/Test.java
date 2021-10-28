package com.lfkj.callbackdemo.Test08;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * 作者：ycl
 * 时间：2021/10/28
 * 描述：
 *                 Obervable：基类，发送0~N个数据，不支持背压；
 *
 *                 create：创建操作符，实现中添加需要异步处理的过程；
 *
 *                 ObservableEmitter：被观察者的发射器，用于将数据或结果通知观察者。其中，onNext可以无限调用，观察者都能接收到；onError和onComplete是互斥的，观察者只能接收到一个；
 *
 *                 subscribeOn：指定被观察者的调度器；
 *
 *                 Schedulers.io()：表示设置被观察者在 io 线程中执行；
 *
 *                 observeOn：指定观察者的调度器；
 *
 *                 AndroidSchedulers.mainThread()：表示回调发生在 Android 主线程中；
 *
 *                 subscribe：指定观察者的处理过程；
 *
 *                 Observer：在 observeOn 指定的线程中实现观察者的处理回调；
 */
public class Test {

    public void Demo(){
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Throwable {
                try {
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(1000);
                        emitter.onNext(i);
                    }
                    emitter.onComplete();
                } catch (InterruptedException e) {
                    emitter.onError(e);
                    e.printStackTrace();
                }
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        System.out.println("onSubscribe");
                    }

                    @Override
                    public void onNext(@NonNull Integer integer) {
                        System.out.println("onNext :" + integer);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        System.out.println("onError");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete");
                    }
                });

    }
}
