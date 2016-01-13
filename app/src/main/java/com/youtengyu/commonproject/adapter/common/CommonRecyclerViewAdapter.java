package com.youtengyu.commonproject.adapter.common;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.youtengyu.commonproject.mInterface.common.DelCommonListener;
import com.youtengyu.commonproject.mInterface.common.EditCommonListener;
import com.youtengyu.commonproject.mInterface.common.OnItemClickCommonListener;
import com.youtengyu.commonproject.mInterface.common.SelectCommonListener;

/**
 * RecyclerView 共用的 Adapter
 * 增加了 4 個 CommonListener
 *
 * 選擇：SelectCommonListener
 * 編輯：EditCommonListener
 * 刪除：DelCommonListener
 * 點擊：OnItemClickCommonListener
 *
 * Created by Yellow on 2016/1/6.
 */
public class CommonRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    protected SelectCommonListener selectCommonListener = null;

    protected EditCommonListener editCommonListener = null;

    protected DelCommonListener delCommonListener = null;

    protected OnItemClickCommonListener onItemClickCommonListener = null;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setSelectCommonListener(SelectCommonListener selectCommonListener){
        this.selectCommonListener = selectCommonListener;
    }

    public void setEditCommonListener(EditCommonListener editCommonListener){
        this.editCommonListener = editCommonListener;
    }

    public void setDelCommonListener(DelCommonListener delCommonListener){
        this.delCommonListener = delCommonListener;
    }

    public void setOnItemClickCommonListener(OnItemClickCommonListener onItemClickCommonListener){
        this.onItemClickCommonListener = onItemClickCommonListener;
    }

}
