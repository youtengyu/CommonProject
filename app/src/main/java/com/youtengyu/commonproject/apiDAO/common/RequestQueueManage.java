package com.youtengyu.commonproject.apiDAO.common;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestQueueManage {
	private static RequestQueue requestQueue;
	

	public static RequestQueue getRequestQueue(Context context){
		if(requestQueue == null){
			requestQueue = Volley.newRequestQueue(context);
		}
		return requestQueue;
	}
}
