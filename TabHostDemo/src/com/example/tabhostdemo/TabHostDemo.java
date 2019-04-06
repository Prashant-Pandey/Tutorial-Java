package com.example.tabhostdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

public class TabHostDemo extends TabActivity{
	TabHost tb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_host_demo);
		tb=getTabHost();
		Intent i;
		TabHost.TabSpec sp;
		i=new Intent().setClass(TabHostDemo.this, Tab1.class);
		sp=tb.newTabSpec("").setIndicator("Call").setContent(i);
		tb.addTab(sp);
		i=new Intent().setClass(TabHostDemo.this, Tab2.class);
		sp=tb.newTabSpec("").setIndicator("Chat").setContent(i);
		tb.addTab(sp);
		i=new Intent().setClass(TabHostDemo.this, Tab3.class);
		sp=tb.newTabSpec("").setIndicator("Contact").setContent(i);
		tb.addTab(sp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tab_host_demo, menu);
		return true;
	}

}
