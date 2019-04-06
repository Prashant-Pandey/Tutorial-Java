package com.example.navigationdrawer;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class ProgressBar extends Activity {
    long time=5000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_bar);
		Timer t=new Timer();
		TimerTask tt=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				Intent i=new Intent(ProgressBar.this,MainActivity.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
				
				
			}
		};
		Thread th=new Thread()
		{
			public void run(){
				try{
					sleep(5000);
				}
				catch(Exception e){
					
				}
				finally{
					finish();
					Intent i=new Intent(ProgressBar.this,MainActivity.class);
					startActivity(i);
				}
			}
		};
		th.start();
		
		t.schedule(tt,time);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_progress_bar, menu);
		return true;
	}

}
