package com.youtengyu.commonproject.tools;

import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 時間轉換
 * Created by Yellow on 2015/12/17.
 */
public class ToolsDateTime {

    enum DateFormate{
        Date("yyyy/MM/dd"),
        DateTime("yyyy/MM/dd HH:mm"),
        DateTimess("yyyy/MM/dd HH:mm:ss"),
        DateDash("yyyy-MM-dd"),
        DateTimeDash("yyyy-MM-dd HH:mm"),
        DateTimessDash("yyyy-MM-dd HH:mm:ss");

        private String formateString;

        DateFormate(String value){
            this.formateString = value;
        }

        public String getFormateString(){
            return formateString;
        }

    }

    /**
     * 時間轉換 若時間字串為空值 就回傳現在時間
     * @param timeString
     * @return
     */
    static public Calendar transToCalendar(String timeString){
        Calendar calendar = null;

        if (TextUtils.isEmpty(timeString)){
            return Calendar.getInstance();
        }

        if (calendar == null) {
            calendar = runTransToCalendar(DateFormate.DateTimess,timeString);
        }

        if (calendar == null) {
            calendar = runTransToCalendar(DateFormate.DateTime,timeString);
        }

        if (calendar == null) {
            calendar = runTransToCalendar(DateFormate.Date,timeString);
        }

        if (calendar == null) {
            calendar = runTransToCalendar(DateFormate.DateTimessDash,timeString);
        }

        if (calendar == null) {
            calendar = runTransToCalendar(DateFormate.DateTimeDash,timeString);
        }

        if (calendar == null) {
            calendar = runTransToCalendar(DateFormate.DateDash,timeString);
        }

        if(calendar != null){
            return calendar;
        }

        return Calendar.getInstance();
    }

    static private Calendar runTransToCalendar(DateFormate dateFormate,String timeString){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormate.getFormateString());
        Calendar calendar = Calendar.getInstance();

        try {
            calendar.setTime(simpleDateFormat.parse(timeString));
        } catch (ParseException e) {
            return null;
        }

        return calendar;
    }

}
