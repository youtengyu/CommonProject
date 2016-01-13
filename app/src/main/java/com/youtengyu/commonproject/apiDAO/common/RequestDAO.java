package com.youtengyu.commonproject.apiDAO.common;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.youtengyu.commonproject.http.HttpParams;

import org.json.JSONObject;

import java.util.Map;


public class RequestDAO {

	/** 發送StringRequest */
	public static void getStringRequest(Context context, String url,
			Response.Listener<String> responListner,
			Response.ErrorListener errorListner,
			final Map<String, String> params) {

		if(responListner == null){
			responListner = initResponListener;
		}
		if(errorListner == null){
			errorListner = initErrorListener;
		}

		StringRequest postRequest = new StringRequest(Request.Method.POST, url,
				responListner, errorListner) {
			@Override
			protected Map<String, String> getParams() {
				return params;
			}

		};
		postRequest.setRetryPolicy(new DefaultRetryPolicy(
                30000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
		RequestQueueManage.getRequestQueue(context).add(postRequest);
	}

	/** 發送StringRequest */
	public static void getStringRequestByArray(Context context, String url,
			Response.Listener<String> responListner,
			Response.ErrorListener errorListner, final HttpParams params) {

		if(responListner == null){
			responListner = initResponListener;
		}
		if(errorListner == null){
			errorListner = initErrorListener;
		}

		StringRequest postRequest = new StringRequest(Request.Method.POST, url,
				responListner, errorListner) {
			@Override
			public byte[] getBody() throws AuthFailureError {
				if (params != null && params.size() > 0) {
					return params.encodeParameters(getParamsEncoding());
				}
				return null;
			}

		};
		postRequest.setRetryPolicy(new DefaultRetryPolicy(
                30000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
		RequestQueueManage.getRequestQueue(context).add(postRequest);
	}

	/** 發送JsonRequest */
	public static void getJsonRequest(Context context, String url,
											   Response.Listener<JSONObject> responListner,
											   Response.ErrorListener errorListner,JSONObject jsonObject) {

		if(responListner == null){
			responListner = initJSONObjectResponListener;
		}
		if(errorListner == null){
			errorListner = initErrorListener;
		}

		JsonObjectRequest jsObjRequest = new JsonObjectRequest
				( url, jsonObject, responListner, errorListner);

		jsObjRequest.setRetryPolicy(new DefaultRetryPolicy(
				30000,
				DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
				DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
		RequestQueueManage.getRequestQueue(context).add(jsObjRequest);
	}

	/**
	 * 若為空值就以下列函式替換
	 */
	private static Response.Listener<String> initResponListener = new Response.Listener<String>() {
		@Override
		public void onResponse(String response) {
		}
	};
	private static Response.Listener<JSONObject> initJSONObjectResponListener = new Response.Listener<JSONObject>() {
		@Override
		public void onResponse(JSONObject response) {
		}
	};

	private static Response.ErrorListener initErrorListener =  new Response.ErrorListener()
	{
		@Override
		public void onErrorResponse(VolleyError error) {
		}
	};

}
