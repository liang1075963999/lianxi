package com.example.liang.lianxi;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        applyPermissions(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        setContentView(R.layout.activity_main);
        RequestBody requestBody=RequestBody.create(MediaType.parse("multipart/form-data"),new File("/storage/emulated/0/1.png"));
        retrofit = new Retrofit.Builder().baseUrl("http://39.107.104.102:8080/").build();
        FileUploadService fileUploadService=retrofit.create(FileUploadService.class);
        Call<ResponseBody>call=fileUploadService.upload(requestBody);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d("MainActivity", "成功");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("MainActivity", "失败");
            }
        });
    }
    public void applyPermissions(Context context, String permission){//参数permission：Manifest.permission.CALL_PHONE
        if(ContextCompat.checkSelfPermission(context, permission)!= PackageManager.PERMISSION_GRANTED)//checkSelfPermission返回的结果如果是0表示同意，1表示禁止
        {
            ActivityCompat.requestPermissions((Activity) context,new String[]{permission},1);//当调用requestPermissions时，系统会自动创建一个对话框
        }else {

        }
    }
}
