package com.youtengyu.commonproject.mInterface.common;

import org.json.JSONObject;

/**
 * API 的介面
 * Created by Yellow on 2015/12/30.
 */
public interface APICommonListener {
    /**
     * 撈取資料
     * @param jsonObject
     */
    public void onResponse(JSONObject jsonObject);
    /**
     * 撈取資料
     * @param index
     * @param jsonObject
     */
    public void onResponse(int index, JSONObject jsonObject);
    /**
     * 錯誤
     */
    public void onError();
}
