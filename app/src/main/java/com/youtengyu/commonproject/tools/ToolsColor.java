package com.youtengyu.commonproject.tools;

import android.content.Context;
import android.os.Build;

/**
 * 顏色 因為23版本有調整
 * Created by Yellow on 2016/1/13.
 */
public class ToolsColor {
    /**
     * 
     * @param context
     * @param id 顏色id(R.color.cxxxxxx)
     * @return
     */
    public static int getColor(Context context , int id){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {//大於23(Android 6.0)
            return context.getResources().getColor(id,null);
        }
        return context.getResources().getColor(id);
    }

}
