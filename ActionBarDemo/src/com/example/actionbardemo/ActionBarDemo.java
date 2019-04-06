package com.example.actionbardemo;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.view.Menu;

public class ActionBarDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_action_bar_demo);
		ActionBar bc=getActionBar();
		ActionBar.Tab t=bc.newTab();
		t.setText("Call");
		t.setTabListener(new TabListener() {
			
			@Override
			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
				// TODO Auto-generated method stub
				Call c =new Call();
				arg1.replace(R.id.fm, c);
			}
			
			@Override
			public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
				// TODO Auto-generated method stub
				
			}
		});
	ActionBar.Tab t1=bc.newTab();
	t1.setText("Chat");
	t1.setTabListener(new TabListener() {
		
		@Override
		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			Chat ch =new Chat();
			arg1.replace(R.id.fm, ch);
		}
		
		@Override
		public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}
	});
	ActionBar.Tab t2=bc.newTab();
	t2.setText("Contact");
	t2.setTabListener(new TabListener() {
		
		@Override
		public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			Contact co =new Contact();
			arg1.replace(R.id.fm, co);
		}
		
		@Override
		public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
			// TODO Auto-generated method stub
			
		}
	});
	bc.setNavigationMode(bc.NAVIGATION_MODE_TABS);
	bc.addTab(t);
	bc.addTab(t1);
	bc.addTab(t2);
}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_action_bar_demo, menu);
		return true;
	}

}
