package com.example.liang.lianxi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by liang on 2018/3/23.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Flowable<Integer> upstream = Flowable.create(new FlowableOnSubscribe<Integer>() {
            @Override
            public void subscribe(FlowableEmitter<Integer> emitter) throws Exception {
                Log.d("xinxi", "emit 1");
                emitter.onNext(1);
                Log.d("xinxi", "emit 2");
                emitter.onNext(2);
                Log.d("xinxi", "emit 3");
                emitter.onNext(3);
                Log.d("xinxi", "emit complete");
                emitter.onComplete();
            }
        }, BackpressureStrategy.ERROR).subscribeOn(Schedulers.newThread()); //增加了一个参数

        Subscriber<Integer> downstream = new Subscriber<Integer>() {

            @Override
            public void onSubscribe(Subscription s) {
                Log.d("xinxi", "onSubscribe");
                s.request(2);  //注意这句代码
            }

            @Override
            public void onNext(Integer integer) {
                Log.d("xinxi", "onNext: " + integer);

            }

            @Override
            public void onError(Throwable t) {
                Log.w("xinxi", "onError: ", t);
            }

            @Override
            public void onComplete() {
                Log.d("xinxi", "onComplete");
            }
        };
        upstream.observeOn(AndroidSchedulers.mainThread()).subscribe(downstream);
    }
}
