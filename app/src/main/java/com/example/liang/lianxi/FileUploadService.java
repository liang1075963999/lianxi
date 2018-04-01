package com.example.liang.lianxi;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by liang on 2018/3/22.
 */

public interface FileUploadService {
    @Multipart
    @POST("uploadtouxiang.jsp")
    Call<ResponseBody> upload(@Part() RequestBody description);
}
