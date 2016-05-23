package com.youtengyu.commonproject.apiDAO.retrofit;

import com.youtengyu.commonproject.apiDAO.common.DBConnector;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by itc on 2016/5/19.
 */
public class RetrofitUtil {

    private static Retrofit retrofit = null;

    public static Retrofit getInstance(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(DBConnector.IPDomen)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
