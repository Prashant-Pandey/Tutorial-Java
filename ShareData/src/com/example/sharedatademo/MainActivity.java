package com.example.sharedatademo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
Button sent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		sent=(Button)findViewById(R.id.button1);
		sent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND); 
			    sharingIntent.setType("text/plain");
			    String shareBody = "DVSwebinfotech.in";
			 //   sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Download The App");
			    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
			    startActivity(Intent.createChooser(sharingIntent, "Apna data "));
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
