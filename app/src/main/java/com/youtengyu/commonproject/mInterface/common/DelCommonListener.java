package com.youtengyu.commonproject.mInterface.common;

/**
 * 刪除的介面
 * Created by Yellow on 2015/12/30.
 */
public interface DelCommonListener {
    /**
     * 刪除行為
     * @param position
     */
    public void onDelete(int position);
    /**
     * 刪除成功
     */
    public void onDelSuccess(Object object);
}
