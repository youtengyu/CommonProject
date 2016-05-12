package com.youtengyu.commonproject.apiDAO.okhttp;


import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by itc on 2016/3/24.
 */

public class OkHttpUtil {

    private static OkHttpClient mOkHttpClient = null;

    public static OkHttpClient getInstance(){
        if(mOkHttpClient==null) {
            mOkHttpClient = new OkHttpClient().newBuilder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build();
        }
        return mOkHttpClient;
    }

    /**
     * 该不会开启异步线程。
     * @param request
     * @return
     * @throws IOException
     */
    public static Response execute(Request request) throws IOException{
        return getInstance().newCall(request).execute();
    }
    /**
     * 该不会开启异步线程。
     * @param URL
     * @param jsonObject
     * @return
     * @throws IOException
     */
    public static Response executeByJSONObject(String URL,JSONObject jsonObject) throws IOException{
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), String.valueOf(jsonObject));
        Request request = new Request.Builder()
                .url(URL)
                .post(body)
                .build();
        return getInstance().newCall(request).execute();
    }
    /**
     * 开启异步线程访问网络
     * @param request
     * @param responseCallback
     */
    public static void enqueue(Request request, Callback responseCallback){
        getInstance().newCall(request).enqueue(responseCallback);
    }

    /**
     * 开启异步线程访问网络
     * @param URL
     * @param responseCallback
     * @param jsonObject
     */
    public static void enqueueByJSONObject(String URL, Callback responseCallback,JSONObject jsonObject){
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), String.valueOf(jsonObject));
        Request request = new Request.Builder()
                .url(URL)
                .post(body)
                .build();

        getInstance().newCall(request).enqueue(responseCallback);
    }
    /**
     * 开启异步线程访问网络, 且不在意返回结果（实现空callback）
     * @param request
     */
    public static void enqueue(Request request){
        getInstance().newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });
    }
    public static String getStringFromServer(String url) throws IOException{
        Request request = new Request.Builder().url(url).build();
        Response response = execute(request);
        if (response.isSuccessful()) {
            String responseUrl = response.body().string();
            return responseUrl;
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }
//    private static final String CHARSET_NAME = "UTF-8";
//    /**
//     * 这里使用了HttpClinet的API。只是为了方便
//     * @param params
//     * @return
//     */
//    public static String formatParams(List<BasicNameValuePair> params){
//        return URLEncodedUtilsHC4.format(params, CHARSET_NAME);
//    }
//    /**
//     * 为HttpGet 的 url 方便的添加多个name value 参数。
//     * @param url
//     * @param params
//     * @return
//     */
//    public static String attachHttpGetParams(String url, List<BasicNameValuePair> params){
//        return url + "?" + formatParams(params);
//    }
    /**
     * 为HttpGet 的 url 方便的添加1个name value 参数。
     * @param url
     * @param name
     * @param value
     * @return
     */
    public static String attachHttpGetParam(String url, String name, String value){
        return url + "?" + name + "=" + value;
    }
}