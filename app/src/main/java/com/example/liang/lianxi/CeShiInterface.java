package com.example.liang.lianxi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by liang on 2018/3/8.
 */

public interface CeShiInterface {
    @GET(value = "teacher?type=4")
    Call<CeShiBean>getData(@Query(value = "num")int i);
}
