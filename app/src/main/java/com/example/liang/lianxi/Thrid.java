package com.example.liang.lianxi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

/**
 * Created by liang on 2018/3/25.
 */

public class Thrid extends AppCompatActivity {
    private LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thrid);
        lottieAnimationView= (LottieAnimationView) findViewById(R.id.animation_view);
        lottieAnimationView.setAnimation("data.json");
        //lottieAnimationView.setImageAssetsFolder("images");当动画中有图片的时候，就得另外加上该方法，将图片导入
        lottieAnimationView.playAnimation();
    }
}
