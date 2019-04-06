package com.example.progress_bar;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Progress_Demo extends Activity {
	long time=8000;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress__demo);
		Timer t=new Timer();
		TimerTask tt=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				Intent i=new Intent(Progress_Demo.this,New_activity.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
				
				
			}
		};
		t.schedule(tt,time);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_progress__demo, menu);
		return true;
	}

}
