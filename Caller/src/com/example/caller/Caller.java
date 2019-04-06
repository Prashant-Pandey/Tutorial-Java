package com.example.caller;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Caller extends Activity {
	Button a,c;
	EditText et;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caller);
		a=(Button)findViewById(R.id.button1);
		c=(Button)findViewById(R.id.button2);
		et=(EditText)findViewById(R.id.editText1);
		a.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Caller.this,ListofNum.class);
				startActivity(i);
				i=getIntent();
				String s=i.getStringExtra("p1");
				et.setText(s);	
			}
		});
		c.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:s"));
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_caller, menu);
		return true;
	}

}
