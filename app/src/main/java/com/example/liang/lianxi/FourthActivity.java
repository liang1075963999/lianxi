package com.example.liang.lianxi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.OnTouch;

/**
 * Created by liang on 2018/3/29.
 */

public class FourthActivity extends AppCompatActivity {
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView1)
    TextView textView1;
 /*   @BindView(R.id.textView2)
    TextView textView2;*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.textView)
    public void j() {
        Toast.makeText(this, "点击了一下", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.textView1)
    public boolean jj() {
        Toast.makeText(this, "长时间点击了", Toast.LENGTH_SHORT).show();
        return true;
    }

    @OnTouch(R.id.textView2)
    public boolean jjj(TextView textView) {
        Toast.makeText(this, "触碰到了"+textView.getText(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
