package com.youtengyu.commonproject.tools;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * 共用的SharedPreferences類別
 * @author RD2-3
 *
 */
public class ToolsSharedPreferences {
    
	/**
	 * 儲存boolean
	 * @param context
	 * @param key
	 * @param value
	 */
	public static void setSPFWithBoolean(Context context,String key,boolean value){
		SharedPreferences preferences = context.getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE);
		Editor mEditor=preferences.edit();
		mEditor.putBoolean(key, value);
		mEditor.commit();
	}
	/**
	 * 取得boolean
	 * @param context
	 * @param key
	 * @return
	 */
	public static boolean getSPFWithBoolean(Context context,String key){
		SharedPreferences preferences = context.getSharedPreferences("SharedPreferences", Activity.MODE_PRIVATE);
		return preferences.getBoolean(key, false);
	}
	/**
	 * 儲存String
	 * @param context
	 * @param key
	 * @param value
	 */
	public static void setSPFWithString(Context context,String key,String value){
		SharedPreferences preferences = context.getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE);
		Editor mEditor=preferences.edit();
		mEditor.putString(key, value);
		mEditor.commit();
	}
	/**
	 * 取得String
	 * @param context
	 * @param key
	 * @return
	 */
	public static String getSPFWithString(Context context,String key){
		SharedPreferences preferences = context.getSharedPreferences("SharedPreferences", Activity.MODE_PRIVATE);
		return preferences.getString(key, "");
	}
}
