package com.example.splashdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//To make title of a layout vanish
		//MUST BE CALLED BEFORE LAYOUT
		setContentView(R.layout.activity_splash_screen);
		
		Thread th=new Thread(){
			public void run(){
			
				try{
					sleep(3000);
				}catch(Exception e){
					
				}
				finally{
					Intent i= new Intent(SplashScreen.this,Splash.class);
					finish();
					startActivity(i);
				}
			}
		};
		th.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_splash_screen, menu);
		return true;
	}

}
