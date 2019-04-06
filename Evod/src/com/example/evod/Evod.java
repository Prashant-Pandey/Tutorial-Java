package com.example.evod;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Evod extends Activity {
	
	Button b;
	EditText e;
	TextView t;
	TextView v;
	int a;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design_2);
		
		b=(Button)findViewById(R.id.button1);
		e=(EditText)findViewById(R.id.editText1);
		t=(TextView)findViewById(R.id.textView1);
		v=(TextView)findViewById(R.id.textView2);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String s=e.getText().toString();
				a=Integer.parseInt(s);
				if(a%2==0){
				v.setText(a+" is even");
				}
				else{
					v.setText(a+"is odd");
				}
				e.setText(null);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design_2, menu);
		return true;
	}

}
