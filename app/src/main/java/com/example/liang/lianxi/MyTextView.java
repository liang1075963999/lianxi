package com.example.liang.lianxi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.OnClick;

/**
 * Created by liang on 2018/3/30.
 */

public class MyTextView extends TextView {
    private Paint paint;
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint=new Paint();
        paint.setColor(Color.GREEN);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(150,150,50f,paint);
        canvas.drawLine(0,0,300,300,paint);
        super.onDraw(canvas);
    }
    @OnClick
    public void danJi(){
        Log.d("MyTextView", "执行2");
        Toast.makeText(getContext(), "你点击了自定义view", Toast.LENGTH_SHORT).show();
    }
}
