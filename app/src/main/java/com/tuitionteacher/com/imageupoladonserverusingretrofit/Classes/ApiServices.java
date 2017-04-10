package com.tuitionteacher.com.imageupoladonserverusingretrofit.Classes;

import com.tuitionteacher.com.imageupoladonserverusingretrofit.ModelClass.ServerResponse;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by acer on 4/3/2017.
 */

public interface ApiServices {

    public interface ApiService {
        @Multipart
        @POST("Retrofit-Tutorial/imageUpload.php")
        Call<ServerResponse> uploadFile(@Part MultipartBody.Part file, @Part("file") RequestBody name);
    }
}
