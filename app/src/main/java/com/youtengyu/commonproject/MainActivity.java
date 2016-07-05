package com.youtengyu.commonproject;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.youtengyu.commonproject.apiDAO.SystemAPIDAO;
import com.youtengyu.commonproject.apiDAO.okhttp.OnFailureListener;
import com.youtengyu.commonproject.apiDAO.okhttp.OnResponseListener;
import com.youtengyu.commonproject.object.CheckVersionModel;
import com.youtengyu.commonproject.object.Example;
import com.youtengyu.commonproject.object.LockCardInboundListRepObject;
import com.youtengyu.commonproject.tools.ToastShow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    private Context context;
    ArrayList<HashMap<String,Object>> aa ;
    ArrayList<HashMap<String,Object>> bb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                SystemAPIDAO.OutletURL(context,OutletURLOnResponseListener,onFailureListener);
            }
        });

        aa = new ArrayList<>();
        HashMap<String, Object> sa = new HashMap<String, Object>();
        sa.put("1","2");
        sa.put("1","2");
        sa.put("1","2");
        aa.add(sa);
        aa.add(sa);

        bb = new ArrayList<HashMap<String,Object>>(aa);

        Log.e("s","s");
        SystemAPIDAO.OutletURL(this,OutletURLOnResponseListener,onFailureListener);


        Log.e("Start","S");
        String BASE_URL = "http://routeapi.chinacloudsites.cn/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LockUnitPreservationList lockUnitPreservationList = retrofit.create(LockUnitPreservationList.class);

//                    Call<Example> call = lockUnitPreservationList.getLockCardInboundListRepObject(
//                            "1wew2",
//                            "17",
//                            "",
//                            "",
//                            "2016-05-11 16:27",
//                            "2016-05-12 16:27",
//                            "1",
//                            "192",
//                            "eZbE91CuG1s:APA91bFLGQG9MBbBqXdY_EiF-qd_sAQlYQZXU_5Tr43wBkAPBlvhfDrtbUTm0uDZzwuN5r-PAfgToXTrUBKDnxOtiztu_XoFUyT-qKR7BW5AA5CIg95qW79GpUdyWjDZTGi419ftp_3i",
//                            "196",
//                            "135"
//                    );
        HashMap<String,String> pp = new HashMap<String, String>();
        pp.put("companyCode","ASUS");
        Call<Example> call = lockUnitPreservationList.getLockCardInboundListRepObject(pp);

//        Example lockCardInboundListRepObjects = call.execute().body();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, retrofit2.Response<Example> response) {
                Log.e("End","E");
                ToastShow.Show(context,"成功");
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                ToastShow.Show(context,"失敗");
            }
        });
        Log.e("Size","");





//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//
//
//
//                try {
//
//                    Log.e("Start","S");
//                    String BASE_URL = "http://routeapi.chinacloudsites.cn/";
//                    Retrofit retrofit = new Retrofit.Builder()
//                            .baseUrl(BASE_URL)
//                            .addConverterFactory(GsonConverterFactory.create())
//                            .build();
//
//                    LockUnitPreservationList lockUnitPreservationList = retrofit.create(LockUnitPreservationList.class);
//
////                    Call<Example> call = lockUnitPreservationList.getLockCardInboundListRepObject(
////                            "1wew2",
////                            "17",
////                            "",
////                            "",
////                            "2016-05-11 16:27",
////                            "2016-05-12 16:27",
////                            "1",
////                            "192",
////                            "eZbE91CuG1s:APA91bFLGQG9MBbBqXdY_EiF-qd_sAQlYQZXU_5Tr43wBkAPBlvhfDrtbUTm0uDZzwuN5r-PAfgToXTrUBKDnxOtiztu_XoFUyT-qKR7BW5AA5CIg95qW79GpUdyWjDZTGi419ftp_3i",
////                            "196",
////                            "135"
////                    );
//                    HashMap<String,String> pp = new HashMap<String, String>();
//                    pp.put("companyCode","ASUS");
//                    Call<Example> call = lockUnitPreservationList.getLockCardInboundListRepObject(pp);
//
//                    Example lockCardInboundListRepObjects = call.execute().body();
//
//                    call.enqueue(new Callback<Example>() {
//                        @Override
//                        public void onResponse(Call<Example> call, retrofit2.Response<Example> response) {
//
//                        }
//
//                        @Override
//                        public void onFailure(Call<Example> call, Throwable t) {
//
//                        }
//                    });
//                    Log.e("Size","");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    Log.e("error",e.toString());
//                }
//                Log.e("End","E");
//            }
//        }).start();
        Log.e("End","SS");
        SystemAPIDAO.CheckVersion(ss);

    }

    public interface LockUnitPreservationList{

        @FormUrlEncoded
        @POST("api/GetLinkURL")
        Call<Example> getLockCardInboundListRepObject(
                @FieldMap Map<String, String> params);
//        Call<Example> getLockCardInboundListRepObject(
//                @Field("CST_House_ID") String CST_House_ID,
//                @Field("CST_Lock_ID") String CST_Lock_ID,
//                @Field("CST_Gateway_ID") String CST_Gateway_ID,
//                @Field("Last_CST_CardInbound_ID") String Last_CST_CardInbound_ID,
//                @Field("StartDateTime") String StartDateTime,
//                @Field("EndDateTime") String EndDateTime,
//                @Field("OrderBy") String OrderBy,
//                @Field("USR_AccountInfo_ID") String USR_AccountInfo_ID,
//                @Field("DeviceID") String DeviceID,
//                @Field("USR_MemberInfo_ID") String USR_MemberInfo_ID,
//                @Field("USR_AppDeviceInfo_ID") String USR_AppDeviceInfo_ID);

    }

    Callback<CheckVersionModel> ss = new Callback<CheckVersionModel>() {
        @Override
        public void onResponse(Call<CheckVersionModel> call, retrofit2.Response<CheckVersionModel> response) {
            ToastShow.Show(context,"成功"+response.body().getIsMaintain()+"-"+response.body().getIsNeedToUpdateAPPVersion());
            Log.e("End","SE");
        }

        @Override
        public void onFailure(Call<CheckVersionModel> call, Throwable t) {
            ToastShow.Show(context,"失敗");
        }
    };


    private OnResponseListener OutletURLOnResponseListener = new OnResponseListener() {
        @Override
        public void onResponse(Response response) {
//            ToastShow.Show(context,"Error");
        }
    };

    private OnFailureListener onFailureListener = new OnFailureListener() {
        @Override
        public void onFailure() {
//            ToastShow.Show(context,"Error");
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
