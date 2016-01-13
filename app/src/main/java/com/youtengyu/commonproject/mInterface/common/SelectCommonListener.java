package com.youtengyu.commonproject.mInterface.common;

/**
 * 選擇的介面
 * Created by Yellow on 2016/1/6.
 */
public interface SelectCommonListener {
    /**
     * 選擇
     * @param position
     */
    public void onSelect(int position);
    /**
     * 選擇
     * @param position
     * @param object
     */
    public void onSelect(int position, Object object);
}
