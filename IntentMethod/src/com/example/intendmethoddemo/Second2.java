package com.example.intendmethoddemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Second2 extends Activity {
      TextView tv1;
      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second2);
		tv1=(TextView)findViewById(R.id.textView1);
		Intent i=getIntent();
		String s=i.getStringExtra("k");
		tv1.setText(s);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second2, menu);
		return true;
	}
      
}
