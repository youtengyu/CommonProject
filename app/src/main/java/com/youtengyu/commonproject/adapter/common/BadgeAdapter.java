package com.youtengyu.commonproject.adapter.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.youtengyu.commonproject.mInterface.common.DelCommonListener;
import com.youtengyu.commonproject.mInterface.common.EditCommonListener;
import com.youtengyu.commonproject.mInterface.common.SelectCommonListener;

/**
 * BadgeAdapter 物件
 * @author Brain_liao 
 */
public class BadgeAdapter extends BaseAdapter {
	protected LayoutInflater mInflater;
	protected Context mContext;

	protected SelectCommonListener selectCommonListener = null;

	protected EditCommonListener editCommonListener = null;

	protected DelCommonListener delCommonListener = null;

	public BadgeAdapter(Context context) {
		mInflater = LayoutInflater.from(context);
		mContext = context;
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public Object getItem(int i) {
		return null;
	}

	@Override
	public long getItemId(int i) {
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewgroup) {
		return null;
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

}