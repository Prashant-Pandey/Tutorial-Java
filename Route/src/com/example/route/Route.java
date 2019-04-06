package com.example.route;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class Route extends Activity {
	
	AutoCompleteTextView a1,a2;
	TextView t1,t2;
	Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_route);
		a1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		a2=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		{
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Route.this,List.class);
				startActivity(i);
				
			}
		});
		String r=a1.getText().toString();
		Intent i1=getIntent();
		String s=i1.getStringExtra("k");
		a1.setText(s);
	}
		{
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Route.this,List2.class);
				startActivity(i);			
			}
		});
		String e =a2.getText().toString();
		Intent i2=getIntent();
		String s1=i2.getStringExtra("p");
		a2.setText(s1);
		}
		
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Route.this,FinalRoute.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_route, menu);
		return true;
	}

}
