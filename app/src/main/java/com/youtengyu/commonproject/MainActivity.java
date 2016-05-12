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
import com.youtengyu.commonproject.object.Example;
import com.youtengyu.commonproject.object.LockCardInboundListRepObject;
import com.youtengyu.commonproject.tools.ToastShow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
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




        new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub



                try {

                    Log.e("Start","S");
                    String BASE_URL = "http://192.168.20.15:8096/";
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

                    LockUnitPreservationList lockUnitPreservationList = retrofit.create(LockUnitPreservationList.class);

                    Call<Example> call = lockUnitPreservationList.getLockCardInboundListRepObject(
                            "1wew2",
                            "17",
                            "",
                            "",
                            "2016-05-11 16:27",
                            "2016-05-12 16:27",
                            "1",
                            "192",
                            "eZbE91CuG1s:APA91bFLGQG9MBbBqXdY_EiF-qd_sAQlYQZXU_5Tr43wBkAPBlvhfDrtbUTm0uDZzwuN5r-PAfgToXTrUBKDnxOtiztu_XoFUyT-qKR7BW5AA5CIg95qW79GpUdyWjDZTGi419ftp_3i",
                            "196",
                            "135"
                    );

                    Example lockCardInboundListRepObjects = call.execute().body();
                    Log.e("Size",lockCardInboundListRepObjects.getLockCardInboundListReps().size()+"");
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.e("error",e.toString());
                }
                Log.e("End","E");
            }
        }).start();



    }

    public interface LockUnitPreservationList{

        @FormUrlEncoded
        @POST("api/getLockCardInboundList")
        Call<Example> getLockCardInboundListRepObject(
                @Field("CST_House_ID") String CST_House_ID,
                @Field("CST_Lock_ID") String CST_Lock_ID,
                @Field("CST_Gateway_ID") String CST_Gateway_ID,
                @Field("Last_CST_CardInbound_ID") String Last_CST_CardInbound_ID,
                @Field("StartDateTime") String StartDateTime,
                @Field("EndDateTime") String EndDateTime,
                @Field("OrderBy") String OrderBy,
                @Field("USR_AccountInfo_ID") String USR_AccountInfo_ID,
                @Field("DeviceID") String DeviceID,
                @Field("USR_MemberInfo_ID") String USR_MemberInfo_ID,
                @Field("USR_AppDeviceInfo_ID") String USR_AppDeviceInfo_ID);

    }


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
