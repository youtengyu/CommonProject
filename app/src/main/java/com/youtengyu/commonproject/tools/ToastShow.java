package com.youtengyu.commonproject.tools;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ToastShow {
	static Toast toast;
	public static void Show(Context t,String s){
		if(t == null){
			return;
		}
		toast = Toast.makeText(t, s, Toast.LENGTH_SHORT);
	    LinearLayout toastLayout = (LinearLayout) toast.getView();
	    TextView toastTV = (TextView) toastLayout.getChildAt(0);
	    toastTV.setTextSize(20);
	    toast.show();
	}
	static void Cancel(Context t,String s){
		if(toast!=null)
			toast.cancel();
	}
}
