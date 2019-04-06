package com.example.expendlistdemo;

import java.util.ArrayList;
import java.util.zip.Inflater;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Info extends BaseAdapter{
	ArrayList<String>nm,mo;
	Context context;
	LayoutInflater inflater;

	public Info(Context applicationContext, ArrayList<String> name,
			ArrayList<String> mob) {
		// TODO Auto-generated constructor stub
		nm=name;
		mo=mob;
		context=applicationContext;
		inflater=LayoutInflater.from(applicationContext);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return nm.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return nm.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View itemView1, ViewGroup parent) {
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		itemView1   = inflater.inflate(R.layout.activity_info, null);
		TextView nm1 = (TextView)itemView1.findViewById(R.id.textView1);
		TextView mo1 = (TextView)itemView1.findViewById(R.id.textView2);
	    nm1.setText(nm.get(position));
		mo1.setText(mo.get(position));
		return itemView1;
	}	
}