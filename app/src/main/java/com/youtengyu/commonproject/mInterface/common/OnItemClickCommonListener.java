package com.youtengyu.commonproject.mInterface.common;

import android.view.View;

/**
 * 點擊的介面
 * Created by Yellow on 2015/12/30.
 */
public interface OnItemClickCommonListener {
    /**
     * 點擊
     * @param v
     */
    public void onClickListener(View v);

    /**
     * 長按
     * @param v
     */
    public void onLongClickListener(View v);
}
