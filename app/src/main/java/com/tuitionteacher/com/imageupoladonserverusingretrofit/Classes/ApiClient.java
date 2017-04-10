package com.tuitionteacher.com.imageupoladonserverusingretrofit.Classes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by acer on 4/3/2017.
 */

public class ApiClient {
    public static final String baseUrl = "https://appsusers.000webhostapp.com/";
    private static Retrofit retrofit = null;
    public static int  unique_id ;

    public static Retrofit getClient(){
        if(retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
