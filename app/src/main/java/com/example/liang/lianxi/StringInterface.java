package com.example.liang.lianxi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by liang on 2018/3/8.
 */

public interface StringInterface {
    @FormUrlEncoded
    @POST(value = "retrofitceshi.jsp")
    Call<String>getString(@Field("ceshi")String zhi, @Header("head")String tou);
}
